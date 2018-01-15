package com.BinaryTree;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//建立二叉树
public class SetUpBinaryTree implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame jFrame=new DynamicImageFrame();
		jFrame.setVisible(true);
		jFrame.setLocation(600,600);
	}
	//创造一颗二叉树
	public TwoLinkBinTree<String> createTree(){
		TwoLinkBinTree<String> binTree=new TwoLinkBinTree<>("45");
		TwoLinkBinTree.TreeNode tn1=binTree.addNode(binTree.root(),"33",true);
		TwoLinkBinTree.TreeNode tn2=binTree.addNode(binTree.root(),"25",false);
		TwoLinkBinTree.TreeNode tn3=binTree.addNode(tn1,"34",true);
		TwoLinkBinTree.TreeNode tn4=binTree.addNode(tn1,"5",false);
		TwoLinkBinTree.TreeNode tn5=binTree.addNode(tn3,"22",true);
		TwoLinkBinTree.TreeNode tn6=binTree.addNode(tn3,"12",false);
		TwoLinkBinTree.TreeNode tn7=binTree.addNode(tn5,"4",true);
		TwoLinkBinTree.TreeNode tn8=binTree.addNode(tn5,"54",false);
		TwoLinkBinTree.TreeNode tn9=binTree.addNode(tn2,"33",true);
		TwoLinkBinTree.TreeNode tn10=binTree.addNode(tn2,"65",false);
		TwoLinkBinTree.TreeNode tn11=binTree.addNode(tn10,"46",true);
		TwoLinkBinTree.TreeNode tn12=binTree.addNode(tn10,"25",false);
		return binTree;
		
	}

}
/*
 * 以图像表示
 */
class DynamicImageFrame extends JFrame{
	public DynamicImageFrame() {
		add(new DynamicImageComponent());
		pack();
	}
}
class DynamicImageComponent extends JComponent{
	private Image image;
	public DynamicImageComponent() {                      
		image=new ImageIcon("src/img/DynamicBinaryTree.gif").getImage();
	}
	public void paintComponent(Graphics g) {
		if(image==null) return;
		g.drawImage(image,0,0,this);
	}
	public Dimension getPreferredSize() {
		return new Dimension(700, 400);
	}
}
