package com.BinaryTree;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
//显示二叉树
public class DisplayBinaryTree implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame=new ImageFrame();
		frame.setVisible(true);//可见
		frame.setLocation(600, 600);//位置
		frame.setSize(1300,1000);//尺寸
	}

}
/*
 * 显示图像
 */
class ImageFrame extends JFrame{
	public ImageFrame() {
		add(new ImageComponent());
		pack();
	}
}
class ImageComponent extends JComponent{
	private Image image;
	public ImageComponent() {                      
		image=new ImageIcon("src/img/BinaryTree.png").getImage();//得到图片路径
	}
	public void paintComponent(Graphics g) {
		if(image==null) return;
		g.drawImage(image,0,0,this);
	}
	
}