package com.BinaryTree;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 实现二叉树节点个数
 */
public class NumberOfNodes implements ActionListener{
	private JTextField TextField;
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<>();
		TreeNode treeNode=binTree.init();
		Object object=numberOfNode(treeNode);
		TextField.setText("二叉树结点个数为:"+object);
		
	}
	/*
	 * 二叉树节点个数
	 */
	public int numberOfNode(TreeNode treeNode) {
		int nodes=0;
		//基准情况为空
		if(treeNode==null) {
			return 0;
		}else {
			//递归调用左右节点
			nodes=1+numberOfNode(treeNode.getLeft())+numberOfNode(treeNode.getRight());
		}
		return nodes;
	}
	public NumberOfNodes(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}

}
