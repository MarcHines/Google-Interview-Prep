/* Given an array, print the possible sums of its contents if you are able to place a + or a - infront of each integer
ie.  Given : {1,2}
     Result: 1 + 2 = 3, -1-2 = -3, 1 - 2 = - 1, -1 + 2 = 1

*/


public static void main(String[] args) {
     int array[] = {1,2,3};
     possibleSums(array);
    }
 
    public static int possibleSums(int arr[]){
      return helper(arr,0,0);
    }
    
    private static int helper(int arr[], int total, int index){
      if(index == arr.length){
          System.out.println("Sum = " + total);
          return 0;
      }
      int plus = total +  arr[index];
      int minus = total - arr[index];
      
      return helper(arr,plus,index + 1) + helper(arr,minus,index + 1);
    }
}
