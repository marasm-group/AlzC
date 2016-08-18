package com.marasm.alzc;

import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vhq473 on 18.08.2016.
 */
public class TreeVisualizer extends JFrame
{
    TreeViewer tree;
    boolean added = false;
    public TreeVisualizer(TreeViewer newtree)
    {
        initUI();
        tree = newtree;
    }

    void initUI()
    {
        setTitle("Syntax Tree");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
    @Override
    public void setVisible(boolean flag)
    {
        super.setVisible(flag);
        if(flag)
        {
            if(!added)
            {
                JScrollPane scrollPane = new JScrollPane(tree);
                add(scrollPane);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                added = true;
                this.setContentPane(scrollPane);
                this.revalidate();
                scrollPane.setPreferredSize(getSize());
            }
        }
    }
}
