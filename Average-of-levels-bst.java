public class Solution {
    public List<Double> averageOfLevels(TreeNode root){
        if(root == null) return null;
         
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Double> result = new ArrayList<>();
        queue.add(root);
    
        while(!queue.isEmpty()){
          int levelNum = queue.size();
          ArrayList<Integer> temp = new ArrayList<>();
         
          for(int i = 0; i < levelNum; i++){
              if(queue.peek().left != null) queue.add(queue.peek().left);
              if(queue.peek().right != null) queue.add(queue.peek().right);
              temp.add(queue.remove().val);
          }
          result.add(averageOfList(temp));
        }
        return result;
    }
    
    public static double averageOfList(List<Integer> list){
        if(list == null || list.size() == 0) return 0;
        int total = 0;
        for(int i : list) 
          total += i;
        
        return (double) total / list.size();
    }
}
