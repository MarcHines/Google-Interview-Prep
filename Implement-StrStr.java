/*
Implement strstr()

This is pretty straight forward. I almost did not post this, but there are some test cases that are easisly forgotten about
when coding, so I posted this anyway, just as a reminder that you always need to consider edge cases. By the way, the strstr() 
function just returns the first index that a substring is found in another string.
eg. "LukeSkywalker"  "walker". The result will be 7;

*/ 


public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        if(needle.isEmpty() || haystack.isEmpty() || needle.equals(haystack)) return 0;
        
        int length = needle.length();
        for(int i = 0; i < haystack.length() - length + 1; i++){
          if(haystack.substring(i, i + length).equals(needle))
            return i;
    }
    return -1;
  }
