package com.BinaryTree;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 求叶子节点的个数
 */
public class NumberLeafNodes implements ActionListener{
	private JTextField TextField;
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<String>();
		TreeNode treeNode=binTree.init();//初始化
		Object object=numberLeafNodes(treeNode);
		TextField.setText("叶子结点个数为:"+object);
		
	}
	/*
	 * 叶子节点
	 */
	public int numberLeafNodes(TreeNode treeNode) {
		int nodes=0;
		//基准为0
		if(treeNode==null) {
			return 0;
		}
		//基准情况：没有左右节点，为1
		else if(treeNode.getLeft()==null&&treeNode.getRight()==null) {
			return 1;
			
		}else {
			//递归各个左右节点
			nodes=numberLeafNodes(treeNode.getLeft())+numberLeafNodes(treeNode.getRight());
		}
		return nodes;
	}
	public NumberLeafNodes(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}
