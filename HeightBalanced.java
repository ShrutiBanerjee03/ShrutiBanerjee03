package BinaryTreeHeightBalanced;

public class HeightBalanced {
      private static class BalanceStatusWithHeight{
    	  public boolean balanced;
    	  public int height;
    	  public BalanceStatusWithHeight(boolean balanced,int height) {
    		  this.balanced=balanced;
    		  this.height=height;
    	  }
    		  public String toString() {
    			  return "The tree is height balanced="+balanced+"and tree height="+height;
    		  }
    	  }
    	  public static boolean isBalanced(BinaryTreeNode<Integer>tree) {
    		  return checkBalanced(tree).balanced;
    	  }
    	  private static BalanceStatusWithHeight checkBalanced(
    		  BinaryTreeNode<Integer>tree) {
    		  if (tree== null) {
    			  return new BalanceStatusWithHeight(true,-1);
    		  }
    		  BalanceStatusWithHeight leftResult= checkBalanced(tree.left);
    		  if(!leftResult.balanced) {return leftResult;
    	  }
    		  BalanceStatusWithHeight rightResult=checkBalanced(tree.right);
    		  if(!rightResult.balanced) {
    			  return rightResult;
    		  }
    		  boolean isBalanced=Math.abs(leftResult.height-rightResult.height)<=1;
    		  int height=Math.max(leftResult.height,rightResult.height)+1;
    		  return new BalanceStatusWithHeight(isBalanced,height);
      }
	public static void main(String[] args) {
	BinaryTreeNode<Integer>root=new BinaryTreeNode<>(2);
	root.left=new BinaryTreeNode<>(1);
	root.left.left=new BinaryTreeNode<>(5);
	root.right=new BinaryTreeNode<>(4);
	root.right.right=new BinaryTreeNode<>(6);
	
	BalanceStatusWithHeight bswh=checkBalanced(root);
	System.out.println(bswh);
		

	}

}
