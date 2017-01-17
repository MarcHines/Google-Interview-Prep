/*Given an array of Strings, find the longest common prefix of all elements in the array */

/* If we sort the array alphabetically, we need only check the first and the last element in the array.
We check each character of both Strings to see if they are equal. If they are, we append to our result
StringBuilder(). The first time they are not equal, we can stop our loop, and return our StringBuilder.toString()
*/


public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        if(strs.length == 1) return strs[0];
        
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        for(int i = 0, j = 0; i < first.length() && j < last.length(); i++, j++){
          if(first.charAt(i) == last.charAt(j)) 
            result.append(first.charAt(i));
            else
            break;
         }
        
            return result.toString();
        
      
}
