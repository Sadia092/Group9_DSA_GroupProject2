package com.project.Transactions;


public class Main {
	
	public static Data data;
    static Data prevNode = null;
    static Data headNode = null;
   
   
    static void transactions(Data root, int order)
    {
       
      
        if(root == null)
        {
            return;
        }
      
        if(order > 0)
        {
            transactions(root.right, order);
        }
        else
        {
            transactions(root.left, order);
        }
        Data rightNode = root.right;
        Data leftNode = root.left;
       
     
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
      
        if (order > 0)
        {
            transactions(leftNode, order);
        }
        else
        {
            transactions(rightNode, order);
        }
    }
   

    static void rightSkewed(Data root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        rightSkewed(root.right);       
    }
   
    
    @SuppressWarnings("static-access")
	public static void main (String[] args)
    {
      
    	// hard-coded the tree
    	
        Main tree = new Main();
        tree.data = new Data(50);
        tree.data.left = new Data(30);
        tree.data.right = new Data(60);
        tree.data.left.left = new Data(10);
        tree.data.right.left = new Data(55);
        
       
        int order = 0;
        transactions(data, order);
        rightSkewed(headNode);
    }

}
