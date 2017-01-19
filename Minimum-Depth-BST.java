/*Return the MINIMUM Depth of a Binary Search Tree */



public int minDepth(TreeNode root) {
     if(root == null) return 0;
     
     int right = minDepth(root.right);
     int left = minDepth(root.left);
     return (left == 0 || right == 0) ? left + right + 1 : Math.min(left,right) + 1;
}
