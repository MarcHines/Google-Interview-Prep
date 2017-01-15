/*Return the sum of the largest Sub Array: Eg. {-1,2,3,-9}: The result is 5, as the largest Subarray is the sub array {2,3}; whose total is 5*/

/*Kadanes Algorithm*/

public int largestSubarray(int arr[]){
  int globalMax = arr[0];
  int localMax = arr[0];
  
  for(int i = 0; i < arr.length(); i++){
    localMax = Math.max(localMax, localMax + arr[i]);
    globalMax = localMax > globalMax ? localMax : globalMax;
  }
  return globalMax;
}
