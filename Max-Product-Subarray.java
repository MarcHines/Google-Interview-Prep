/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/

public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = Integer.MIN_VALUE, prevMax = 1, prevMin = 1;
        
        for(int num : nums){
            int val1 = num * prevMax;
            int val2 = num * prevMin;
            //Get the min and the max
            prevMax = Math.max(num, Math.max(val1, val2));
            prevMin = Math.min(num, Math.min(val1, val2));
            
            //Update max if needed
            result = Math.max(result, prevMax);
        }
        return result;
    }
