/*
Given an integer n, return 1 - n in lexicographical order.
For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].    */

  public static ArrayList<Integer> lexicalOrder(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        dfs(1, 9, n, result);
        return result;
    }
    
    private static void dfs(int start, int end, int n, ArrayList<Integer> result){
        for (int i = start; i <= end && i <= n; i++){
            result.add(i);
            dfs(i * 10, i * 10 + 9, n, result); 
        }
    }
