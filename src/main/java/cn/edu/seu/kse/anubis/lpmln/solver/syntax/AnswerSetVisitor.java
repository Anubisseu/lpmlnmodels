package cn.edu.seu.kse.anubis.lpmln.solver.syntax;

import cn.edu.seu.kse.anubis.lpmln.model.WeightedAnswerSet;
import sun.awt.windows.WEmbeddedFrame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 王彬 on 2016/8/31.
 */
public class AnswerSetVisitor extends DLVResultBaseVisitor {
    public int maxLevel2=0;
    public int maxLevel1=0;
    private List<WeightedAnswerSet>  was=new ArrayList<>();
    private List<WeightedAnswerSet>  maxWeightAs=new ArrayList<>();

    @Override
    public Object visitWeighted_answer_set(DLVResultParser.Weighted_answer_setContext ctx) {
        WeightedAnswerSet as=new WeightedAnswerSet();
        DLVResultParser.Answer_setContext asctx=ctx.answer_set();
        DLVResultParser.WeightContext wctx=ctx.weight();
        HashSet<String> literals=as.getAnswerSet().getLiterals();
        List<Integer> weights=as.getWeights();

        for(DLVResultParser.LiteralContext lctx : asctx.literal()){
            literals.add(lctx.getText());
        }

        String weightstr=null;
        int weight=0;
        int cnt=0;
        for(DLVResultParser.Weight_levelContext wlctx : wctx.weight_level()){

            weightstr=wlctx.natural_number(0).getText();
            weight=Integer.valueOf(weightstr);
            weights.add(weight);

            if(cnt == 1){
                if(maxLevel2 < weight){
                    maxLevel2=weight;
                }
            }else if(cnt == 0){
                if(maxLevel1 < weight){
                    maxLevel1=weight;
                }
            }
            cnt++;
        }


        return null;
    }

    @Override
    public List<WeightedAnswerSet> visitPossible_worlds(DLVResultParser.Possible_worldsContext ctx) {
        List<WeightedAnswerSet> result=new ArrayList<>();
        int weight=0;
        for(WeightedAnswerSet as : was){
            if(as.getWeights().get(1) == maxLevel2){
                result.add(as);

                if(as.getWeights().get(0) == maxLevel1){
                    maxWeightAs.add(as);
                }
            }
        }

        return result;
    }

    public List<WeightedAnswerSet> getMaxWeightAs() {
        return maxWeightAs;
    }

    public void setMaxWeightAs(List<WeightedAnswerSet> maxWeightAs) {
        this.maxWeightAs = maxWeightAs;
    }

    public String getMaxWeight(){
        StringBuilder sb=new StringBuilder();

        return sb.toString();
    }
}
