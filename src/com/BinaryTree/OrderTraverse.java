package com.BinaryTree;

import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.BinaryTree.TwoLinkBinTree.TreeNode;
/*
 * 输出中序遍历结果
 */
public class OrderTraverse implements ActionListener{
	private JTextField TextField;
	ArrayList<Object> list=new ArrayList<Object>();
	@Override
	public void actionPerformed(ActionEvent e) {
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<>();
		TreeNode treeNode=binTree.init();
		Object object=OrderTraversal(treeNode);
		TextField.setText("中序遍历结果为:"+object);
		
	}
	/*
	 * 中序遍历
	 */
	public ArrayList<Object> OrderTraversal(TreeNode treeNode) {
		//左节点不为空，递归左节点
		if(treeNode.getLeft()!=null) {
			OrderTraversal(treeNode.getLeft());
		}
		//添加到节点队列中
		list.add(treeNode.getData());
		//右节点不为空，递归右节点
		if(treeNode.getRight()!=null) {
			OrderTraversal(treeNode.getRight());
		}
		 return list;
	}
	public OrderTraverse(JTextField jtextField) {
		TextField=DisplayResult(jtextField);
	}
	public JTextField DisplayResult(JTextField textField) {
		return textField;
	}
}
