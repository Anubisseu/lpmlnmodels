package cn.edu.seu.kse.anubis.lpmln.translator;

import cn.edu.seu.kse.anubis.lpmln.model.Rule;
import cn.edu.seu.kse.anubis.lpmln.syntax.SyntaxModule;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 王彬 on 2016/8/30.
 */
public class ASPTranslatorTest {
    private String path="G:\\IdeaProjects\\lpmlnmodels\\src\\test\\resources\\friend.txt";
    private File rulef=new File(path);
    private int factor=0;
    private List<Rule> rules=null;
    private HashSet<String> herbrandUniverse=null;

    @Before
    public void parse() throws IOException {
        SyntaxModule sm=new SyntaxModule();
        rules= sm.parse(rulef);
        factor=sm.getFactor();
        herbrandUniverse=sm.getHerbrandUniverse();
    }

    @Test
    public void testTranslate() {

        ASPTranslator translator=new ASPTranslator();
        translator.setFactor(factor);
        translator.setHerbrandUniverse(herbrandUniverse);
        String asprules=translator.translate(rules);
        System.out.println(asprules);
    }

    @Test
    public void testDLVTranslate() {
        DLVTranslator translator=new DLVTranslator();
        translator.setFactor(factor);
        translator.setHerbrandUniverse(herbrandUniverse);
        String asprules=translator.translate(rules);
        System.out.println(asprules);
    }

    @Test
    public void testPlogTranslator() {
        PlogTranslator translator=new PlogTranslator();
        translator.setFactor(factor);
        translator.setHerbrandUniverse(herbrandUniverse);
        String asprules=translator.translate(rules);
        System.out.println(asprules);
    }

    @Test
    public void testPlogCRRuleTranslator(){
        PlogCRRuleTranslator translator=new PlogCRRuleTranslator();
        translator.setFactor(factor);
        translator.setHerbrandUniverse(herbrandUniverse);
        String asprules=translator.translate(rules);
        System.out.println(asprules);
    }
}