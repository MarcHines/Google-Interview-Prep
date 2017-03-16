/* Given an array, print the possible sums of its contents if you are able to place a + or a - infront of each integer
ie.  Given : {1,2}
     Result: 1 + 2 = 3, -1-2 = -3, 1 - 2 = - 1, -1 + 2 = 1

*/
    public static ArrayList<Integer> possibleSums(String num){
      ArrayList<int[]> allNumbers = possibleNumbers(num);
      ArrayList<Integer> result = new ArrayList<>();
         
      for(int[] arr : allNumbers) 
        result.add(helper(arr,0,0));
      return result;
    }
//This function takes a String num "123" and turns it into arrays with all possible sections of numbers, ie. {123}, {1,23}, {12,3}
 public ArrayList<int[]> possibleNumbers(String num) {
        ArrayList<int[]> result = new ArrayList<>();
        int temp[] = new int[2];
       
        for(int i = 0; i < num.length(); i++){
           String a = num.substring(0,i);
           String b = num.substring(i);
           
           temp[0] = a.equals("") ? 0 : Integer.parseInt(a);
           temp[1] = b.equals("") ? 0 : Integer.parseInt(b);
           result.add(temp);
        }
        return result;
    }
//--------------------------------------------------------
    private static int helper(int arr[], int total, int index, ArrayList<Integer> sum){
      if(index == arr.length){
         sum.add(total);
         return sum;
      }
      int plus = total +  arr[index];
      int minus = total - arr[index];
      
      return helper(arr,plus,index + 1) + helper(arr,minus,index + 1);
    }
}
