
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;  
    }
    
    private int helper(TreeNode root){
        if(root == null) return 0;
        
        int right = helper(root.right);
        int left = helper(root.left);
        if(left < 0 || right < 0) return -1;
        
        int diff = Math.abs(right - left);
        if(diff > 1) return -1;
        
        return Math.max(right + 1,left + 1);
    }
}
