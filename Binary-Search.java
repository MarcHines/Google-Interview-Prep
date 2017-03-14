/*
Given a target return the index in the array that the target is located at. If the target is not in the array,
return the index that the target should be at if it were in the array.
*/

//The solution to this is literally Binary Search
 public int searchInsert(int[] nums, int target) {      
   int first = 0;        
   int last = nums.length - 1;        
   int middle;   
 
   while( first <= last){            
     middle = (first + last) / 2;      
     
     if(nums[middle] == target) return middle;           
     else
     if(nums[middle] < target)              
       first = middle + 1;             
     else           
     if(nums[middle] > target)              
       last = middle - 1;           
   }        
  return first;
 }
