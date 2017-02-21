/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that 
nums[i] = nums[j] and the absolute difference between i and j is at most k.

The niave solution would be using two for loops and checking if each i and j.
*/

 public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return false;
       
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        
        for(int i : nums){
          if(map.containsKey(i))
          if(Math.abs(index - map.get(i)) <= k) return true;
            map.put(i, index++);
        }
        return false;
    }
