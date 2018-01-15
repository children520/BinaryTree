
package com.BinaryTree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 先序遍历
 */
public class PreorderTraverse implements ActionListener{
	private JTextField TextField;
	ArrayList<Object> list=new ArrayList<Object>();
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<>();
		TreeNode treeNode=binTree.init();
		Object object=PreorderTraversal(treeNode);
		TextField.setText("先序遍历结果为:"+object);
		
	}
	
	public ArrayList<Object> PreorderTraversal(TreeNode treeNode) {
		//先从根节点
		list.add(treeNode.getData());
		//左节点递归
		if(treeNode.getLeft()!=null) {
			PreorderTraversal(treeNode.getLeft());
		}
		//右节点递归
		if(treeNode.getRight()!=null) {
			PreorderTraversal(treeNode.getRight());
		}
		 return list;
	}
	public PreorderTraverse(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}
