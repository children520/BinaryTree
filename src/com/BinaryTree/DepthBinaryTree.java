package com.BinaryTree;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
/*
 * 二叉树的深度
 */
public class DepthBinaryTree implements ActionListener{
	private JTextField TextField;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		SetUpBinaryTree BinaryTreeInstance=new SetUpBinaryTree();
		TwoLinkBinTree<String> binTree=BinaryTreeInstance.createTree();//创造树
		TextField.setText("二叉树的深度为:"+binTree.deep());
	}
	
	public DepthBinaryTree(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}

	

