package cn.edu.seu.kse.lpmln.solver.parallel.AugmentedSubsetWay;

import cn.edu.seu.kse.lpmln.model.Rule;
import cn.edu.seu.kse.lpmln.translator.BaseTranslator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 许鸿翔 on 2017/9/23.
 */
public class AugmentedSubsetPartitioner {
    protected TRANSLATION_TYPE policy = TRANSLATION_TYPE.SPLIT_SIMPLE;
    public enum TRANSLATION_TYPE{SPLIT_SIMPLE, SPLIT_RANDOM, TEST};
    protected AugmentedSolver solver;

    public AugmentedSubsetPartitioner(AugmentedSolver solver){
        this.solver = solver;
    }

    //输入：原规则，翻译后的规则文本
    //输出：增强子集文件列表，子集对应的额外权重
    public void partition(List<Rule> originRule, BaseTranslator translator){
        List<String> translatedFiles = solver.getTranslatedFiles();
        List<AugmentedSubset> subsets;
        switch (policy){
            case SPLIT_SIMPLE:
                subsets = simplePartition(translator);
                break;
            case SPLIT_RANDOM:
                subsets = randomPartition(translator);
                break;
            default:
                subsets = simplePartition(translator);
        }

        try {
            for (AugmentedSubset as : subsets) {
                boolean[] added = new boolean[translator.getUnknownRules().size()];
                StringBuilder subset = new StringBuilder(translator.getStaticPart()+System.lineSeparator());
                //子集求解过程中乘上factor，这里也要乘
                for (Integer idx : as.positive) {
                    added[idx] = true;
                    subset.append(translator.getSatRules().get(idx))
                            .append(System.lineSeparator());
                }

                for (Integer idx : as.negative){
                    added[idx] = true;
                    subset.append(translator.getUnsatRules().get(idx))
                            .append(System.lineSeparator());;
                }

                for(int i=0;i<added.length;i++){
                    if(!added[i]){
                        subset.append(translator.getUnknownRules().get(i))
                                .append(System.lineSeparator());
                    }
                }

                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                String outFile = UUID.randomUUID().toString()+sdf.format(new Date())+"_"+translatedFiles.size()+".lp";
                BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
                bw.write(subset.toString());
                bw.close();

                translatedFiles.add(outFile);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        solver.setThreadNums(Math.min(solver.getThreadNums(),subsets.size()));
        return;
    }

    public List<AugmentedSubset> randomPartition(BaseTranslator translator){
        List<AugmentedSubset> subsets = new ArrayList<>();
        return subsets;
    }

    public List<AugmentedSubset> simplePartition(BaseTranslator translator){
        List<AugmentedSubset> subsets = new ArrayList<>();
        int corepow2 = (int)(Math.log(solver.getThreadNums())/Math.log(2));
        corepow2 = Math.min(corepow2,translator.getUnknownRules().size());
        for(int i=0;i<Math.pow(2,corepow2);i++){
            AugmentedSubset as = new AugmentedSubset();
            int toConstruct = i;
            for(int j=0;j<corepow2;j++){
                if(toConstruct%2==0){
                    as.positive.add(j);
                }else{
                    as.negative.add(j);
                }
                toConstruct>>=1;
            }
            subsets.add(as);
        }
        return subsets;
    }
}

class AugmentedSubset{
    protected HashSet<Integer> positive;
    protected HashSet<Integer> negative;
    public AugmentedSubset(){
        positive = new HashSet<>();
        negative = new HashSet<>();
    }
}