/*
Given a list of integers with all elements being duplicated except ONE, find the element that is not duplicated
ie.  int array[] = {1,2,3,4,4,3,1,5,2,14,5}; Result would be 14;
Of course we could use a map to count the occurences of each element in the array, and then loop back over it and
return the Key whose value is equal to 1. But with bit operator XOR, we can solve this problem. All duplicates when 
XOR'd with themselves cancel out, and we are left with the single, non duplicated elemtent
*/


    public int nonRepeat(int array[]){
      int nonDuplicate = 0;
      for(int i : array)
        nonDuplicate ^= i;
        
      return nonDuplicate;
    }

