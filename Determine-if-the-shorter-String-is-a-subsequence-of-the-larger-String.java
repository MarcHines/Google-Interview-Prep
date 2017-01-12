/*Given two Strings, determine if the shorter one is a subsequence of the longer one*/

/*The idea is just to build the subsequence as we iterate over the longer String. If it is indeed a subsquence, then we should be able
to build an exact copy of the shorter String as we iterate though the longer String, from charaters within the longer String. */


    public boolean isSubsequence(String shorter, String longer) {
        if(shorter.length() < 1 ) return true;
        if(longer.length() < 1) return false;
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int index = 0;
        
        for(int i = 0; i < longer.length(); i++){
            char needle = shorter.charAt(index);
            char haystack = longer.charAt(i);
            
            if(needle == haystack){
              sb.append(haystack);
              index++;
              
            if(sb.toString().equals(shorter))
              return true;
            }
            
        }
      return false;
        
    }
