package com.BinaryTree;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 二叉树度为一的节点个数
 */
public class OneNumberOfNodes implements ActionListener{
	private JTextField TextField;
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<String>();
		TreeNode treeNode=binTree.init();
		Object object=oneNumberOfNodes(treeNode);
		TextField.setText("二叉树度为一的结点个数为:"+object);
		
	}
	/*
	 * 实现功能的函数
	 */
	public int oneNumberOfNodes(TreeNode treeNode) {
		int nodes=0;
		if(treeNode==null) {
			return 0;
		}
		//左右节点都为空
		else if(treeNode.getLeft()==null&&treeNode.getRight()==null) {
			return 0;
		}
		//左节点不为空右节点为空，递归左节点
		else if(treeNode.getLeft()!=null&&treeNode.getRight()==null) {
			nodes=1+oneNumberOfNodes(treeNode.getLeft());
		}
		//右节点不为空左节点为空，递归右节点
		else if(treeNode.getRight()!=null&&treeNode.getLeft()==null) {
			nodes= 1+oneNumberOfNodes(treeNode.getRight());
		}
		//左右节点都不为空
		else if(treeNode.getLeft()!=null&&treeNode.getRight()!=null) {
			nodes= oneNumberOfNodes(treeNode.getLeft())+oneNumberOfNodes(treeNode.getRight());
			
		}
		return nodes;
		
	}
	public OneNumberOfNodes(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}
