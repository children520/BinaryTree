package com.BinaryTree;
/*
 * 二叉树各个方法的实现
 */
public class TwoLinkBinTree<E> {
	public static class TreeNode{
		//数据域
		Object data;
		//左子节点
		TreeNode left;
		//右子节点
		TreeNode right;
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public TreeNode getLeft() {
			return left;
		}
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public TreeNode getRight() {
			return right;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}
		public TreeNode(){		
		}
		public TreeNode(Object data){
			this.data=data;
		}
		public TreeNode(Object data,TreeNode left,TreeNode right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	private TreeNode root;
	public TwoLinkBinTree(){
		this.root=new TreeNode();
	}
	//以指定根元素来创建二叉树
	public TwoLinkBinTree(E data){
		this.root=new TreeNode(data);
	}
	/**
	 * 为指定节点添加子节点
	 * @param parent 需要添加子节点的父节点的索引
	 * @param data 新子节点的数据
	 * @param isLeft 是否为左节点
	 * @return 新增的节点
	 */
	public TreeNode addNode(TreeNode parent,E data,boolean isLeft){
		if(parent==null){
			throw new RuntimeException(parent+"节点为null,无法添加子节点");
		}
		if(isLeft&&parent.left!=null){
			throw new RuntimeException(parent+"节点已有左子节点，无法添加左子节点");
		}
		if(!isLeft&&parent.right!=null){
			throw new RuntimeException(parent+"节点已有右子节点，无法添加右子节点");
		}
		TreeNode newNode=new TreeNode(data);
		if(isLeft){
			//让父节点的left引用指向新节点
			parent.left=newNode;
		}else{
			//让父节点的right引用指向新节点
			parent.right=newNode;
		}
		return newNode;
	}
	//判断二叉树是否为空
	public boolean empty(){
		return root.data==null;
	}
	//返回根节点
	public TreeNode root(){
		if(empty()){
			throw new RuntimeException("树为空，无法访问根节点");
		}
		return root;
	}
	public TreeNode init() {
		TreeNode A=new TreeNode(4,null,null);
		TreeNode B=new TreeNode(54,null,null);
		TreeNode C=new TreeNode(12,null,null);
		TreeNode D=new TreeNode(5,null,null);
		TreeNode E=new TreeNode(46,null,null);
		TreeNode F=new TreeNode(25,null,null);
		TreeNode G=new TreeNode(33,null,null);
		TreeNode H=new TreeNode(22,A,B);
		TreeNode I=new TreeNode(34,H,C);
		TreeNode J=new TreeNode(33,I,D);
		TreeNode K=new TreeNode(65,E,F);
		TreeNode L=new TreeNode(25,G,K);
		TreeNode M=new TreeNode(45,J,L);
		return M;
		
	}
	//返回指定节点（非根节点）的父节点
	public E parent(TreeNode node){
		//对于二叉链表存储法，如果要访问指定节点的父节点，必须遍历二叉树
		return null;
	}
	//返回指定节点（非叶子节点）的左子节点
	public E leftChild(TreeNode parent){
		if(parent==null){
			throw new RuntimeException("节点为Null,无法添加子节点");
		}
		return parent.left==null?null:(E)parent.left.data;
	}
	//返回指定节点的右子节点
	public E rightChild(TreeNode parent){
		if(parent==null){
			throw new RuntimeException(parent+"节点为null，无法添加子节点");
		}
		return parent.right==null?null:(E)parent.right.data;
	}
	//返回二叉树的深度
	public int deep(){
		return deep(root);
	}
	//递归，第棵子树的深度为其所有子树的最大深度+1
	private int deep(TreeNode node){
		if(node==null){
			return 0;
		}
		//没有子树
		if(node.left==null&&node.right==null){
			return 1;
		}else{
			int leftDeep=deep(node.left);
			int rightDeep=deep(node.right);
			//记录其所有左、右子树中较大的深度
			int max=leftDeep>rightDeep?leftDeep:rightDeep;
			//返回其左、右子树中较大的深度+1
			return max+1;
		}
	}
}
