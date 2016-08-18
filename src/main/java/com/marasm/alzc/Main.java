/**
 * Created by vhq473 on 18.08.2016.
 */
package com.marasm.alzc;


import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello World!");
        String testStr = "import \"VEGA\" \"conio\" \"common\";\n" +
                "$: setColor(color(0 255 0));\n" +
                "$: drawRect(0 0 100 100);\n" +
                "fun: color(r g b) :number\n" +
                "  return add(b add(mul(g 256) mul(r 65536)));\n" +
                "end";
        ByteArrayInputStream strStream = new ByteArrayInputStream(testStr.getBytes(StandardCharsets.UTF_8));
        CharStream stream = new ANTLRInputStream(strStream);
        AlzheimerLexer lexer = new AlzheimerLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlzheimerParser parser = new AlzheimerParser( tokens );
        ParseTree tree = parser.program();
        ArrayList<String> rules = new ArrayList<>(Arrays.asList(parser.getRuleNames()));
        ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk( new AlzheimerWalker(), tree );
        TreeViewer treeViewer = new TreeViewer(rules,tree);
        TreeVisualizer tv = new TreeVisualizer(treeViewer);
        tv.setVisible(true);
    }
}
