//Inorder traversal. This can be done in a more sexy way...
public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> nodes = helper(root, new ArrayList<>());
        for(int i = 0; i + 1 < nodes.size(); i++)
          if(nodes.get(i) >= nodes.get(i + 1)) return false;
       return true;  
    }
    
    private ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> list){
         if(root == null) return list;
         
         helper(root.left,list);
         list.add(root.val);
         helper(root.right,list);
         
         return list;
    }
    
    
    
    //Cool solutions. Recursion
     public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
   
