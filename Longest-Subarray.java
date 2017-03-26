/*Return the sum of the largest Sub Array: Eg. {-1,2,3,-9}: The result is 5, as the largest Subarray is the sub array {2,3}; whose total is 5*/

/*Kadanes Algorithm*/

 public int maxSubArray(int[] nums) {
      if(nums == null ||  nums.length == 0) return 0;
   
      int localMax = nums[0], globalMax = nums[0];
      for(int i = 1; i < nums.length; i++){
          localMax = Math.max(nums[i], localMax + nums[i]);
          globalMax = Math.max(localMax, globalMax);
      }
      return globalMax;
    }
