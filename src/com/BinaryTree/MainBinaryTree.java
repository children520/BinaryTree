package com.BinaryTree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;
/*
 * 主类，显示各个图形
 */
public class MainBinaryTree{
	public static void main(String[] args) {
		JFrame jFrame=new BinaryTree();
		jFrame.setTitle("二叉树操作图形化用户界面");
		jFrame.setSize(1000,1000);
		jFrame.setLocation(100, 100);
		jFrame.setVisible(true);
	}
}
class BinaryTree extends JFrame{
	private JButton jb=new JButton("显示二叉树");
	private JButton
		b1=new JButton("建立一棵二叉树"),
		b2=new JButton("中序遍历结果"),
		b3=new JButton("前序遍历结果"),
		b4=new JButton("后序遍历结果"),
		b5=new JButton("二叉树的深度"),
		b6=new JButton("二叉树的结点个数"),
		b7=new JButton("二叉树的叶结点个数"),
		b8=new JButton("二叉树的度为 1 的结点个数");
	private JTextField
		j1=new JTextField("点击左边的按钮获取答案"),
		j2=new JTextField("点击左边的按钮获取答案"),
		j3=new JTextField("点击左边的按钮获取答案"),
		j4=new JTextField("点击左边的按钮获取答案"),
		j5=new JTextField("点击左边的按钮获取答案"),
		j6=new JTextField("点击左边的按钮获取答案"),
		j7=new JTextField("点击左边的按钮获取答案"),
		j8=new JTextField("点击左边的按钮获取答案");

	
	public BinaryTree() {
		setLayout(null);
		//各个按钮以及文本框的位置
		b1.setBounds(100, 60, 200, 50);
		j1.setBounds(500, 60, 400, 50);
		add(b1);
		add(j1);
		b2.setBounds(100, 140, 200, 50);
		j2.setBounds(500, 140, 400, 50);
		add(b2);
		add(j2);
		b3.setBounds(100, 220, 200, 50);
		j3.setBounds(500, 220, 400, 50);
		add(b3);
		add(j3);
		b4.setBounds(100, 300, 200, 50);
		j4.setBounds(500, 300, 400, 50);
		add(b4);
		add(j4);
		b5.setBounds(100, 380, 200, 50);
		j5.setBounds(500, 380, 400, 50);
		add(b5);
		add(j5);
		b6.setBounds(100, 460, 200, 50);
		j6.setBounds(500, 460, 400, 50);
		add(b6);
		add(j6);
		b7.setBounds(100, 540, 200, 50);
		j7.setBounds(500, 540, 400, 50);
		add(b7);
		add(j7);
		b8.setBounds(100, 620, 200, 50);
		j8.setBounds(500,620, 400, 50);
		add(b8);
		add(j8);
		add(jb);
		jb.setBounds(160, 750, 500, 100); 
		//具体各个按钮的功能在各个类实现
		jb.addActionListener(new DisplayBinaryTree());
		b1.addActionListener(new SetUpBinaryTree());
		b2.addActionListener(new OrderTraverse(j2));
		b3.addActionListener(new PreorderTraverse(j3));
		b4.addActionListener(new PostorderTraverse(j4));
		b5.addActionListener(new DepthBinaryTree(j5));
		b6.addActionListener(new NumberOfNodes(j6));
		b7.addActionListener(new NumberLeafNodes(j7));
		b8.addActionListener(new OneNumberOfNodes(j8));
	
		
		
		
	}
	
	

}
