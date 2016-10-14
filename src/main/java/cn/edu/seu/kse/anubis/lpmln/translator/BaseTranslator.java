package cn.edu.seu.kse.anubis.lpmln.translator;

import cn.edu.seu.kse.anubis.lpmln.model.Rule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 王彬 on 2016/8/30.
 */
public class BaseTranslator {
    protected int factor=1;
    protected HashSet<String> herbrandUniverse;
    protected String path="";

    public String translate(List<Rule> rules){
        StringBuilder sb=new StringBuilder();
        String rulestr=null;
        sb.append(translateDeclarationPart(herbrandUniverse));
        for(Rule r:rules){
            if(r.isSoft()){
                rulestr=translateSoftRule(r);
            }else {
                rulestr=translateHardRule(r);
            }
            sb.append(rulestr).append(System.lineSeparator());
        }

        sb.append(trickPart());
        return sb.toString();
    }

    public String trickPart(){
        return "";
    }

    public String translate2File(List<Rule> rules) throws IOException {
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String outf=path+"rule"+(int) (Math.random()*1000)+sdf.format(now);
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File(outf)));
        String rule=translate(rules);
        bw.write(rule);
        bw.close();
        return outf;
    }

    public String translateSoftRule(Rule rule){
        StringBuilder sb=new StringBuilder();

        return sb.toString();
    }

    public String translateHardRule(Rule rule){
        StringBuilder sb=new StringBuilder();

        return sb.toString();
    }

    protected String translateDeclarationPart(HashSet<String> hbu){
        StringBuilder sb=new StringBuilder();

        return sb.toString();
    }
}
