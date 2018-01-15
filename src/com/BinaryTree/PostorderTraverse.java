package com.BinaryTree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 后序遍历
 */
public class PostorderTraverse implements ActionListener {
	private JTextField TextField;
	ArrayList<Object> list=new ArrayList<Object>();
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<>();
		TreeNode treeNode=binTree.init();
		Object object=PostorderTraversal(treeNode);
		TextField.setText("后序遍历结果为:"+object);
		
	}
	public ArrayList<Object> PostorderTraversal(TreeNode treeNode) {
		//左节点不为空，递归左节点
		if(treeNode.getLeft()!=null) {
			PostorderTraversal(treeNode.getLeft());
		}
		//右节点不为空，递归右节点
		if(treeNode.getRight()!=null) {
			PostorderTraversal(treeNode.getRight());
		}
		//再添加到队列中
		list.add(treeNode.getData());
		 return list;
	}
	public PostorderTraverse(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}
