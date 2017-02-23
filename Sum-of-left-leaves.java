/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

*/

 public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
 }
    
    private int helper(TreeNode root, boolean isLeft){
        if(root == null) return 0;
        
        if(root.left == null && root.right == null){
            if(isLeft) return root.val; 
            
            return 0;  
        }
        return helper(root.left,true) + helper(root.right,false);
    }
    
    /*
      We are traversing the entire tree recursively. What defines a left leaf? A node who has two null children is a leaf. 
      When can keep track if a leaf is a left leaf when we traverse, by setting an isLeft boolean to true when we return
      helper(root.left) ie, helper(root.left, true);
    */
