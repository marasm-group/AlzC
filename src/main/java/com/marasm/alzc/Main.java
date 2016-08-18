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

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream(args[0]);
        CharStream stream = new ANTLRInputStream(fis);
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
