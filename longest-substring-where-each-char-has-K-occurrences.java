
/*
Find the length of the longest substring T of a given string such that every character in T appears no less than k times.
EXAMPLES: 
Input: s = "aaabb", k = 3   Output: 3 (The longest substring is "aaa", as 'a' is repeated 3 times.)
Input: s = "ababbc", k = 2  Output: 5 (The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.)
*/


/*                                              --------SOLUTION EXPLANTION------------
The idea is to Divide & Conquer. We contruct a HashMap with the amount of occurences of each character. From there, we iterate over
the input String until we encounter a character that does not appear at least K times. From there, we know that our longest substring 
that satisfies our condition can not include the character that we have just stopped at.So we can split the string half,ie. Left and Right.
Left being everything to the left of where we stopped, and Right being everything to the right of where we stopped. Since we are looking
for the LONGEST substring that meets our condition, we only care about the maximum between left and right. The longest can never be 
on the left if the left is the minimum between the two, and vice versa. Try to convince yourself of this. When we finally get to the point 
that the string has all characters that meet our condition, our for looop eventually ends, and our method returns the length of that String.
*/



public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
        
        HashMap<Character, Integer> counts = getCounts(s);
        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i+1), k);
                return  Math.max(left, right);
            }
        }
        return s.length();
    }
    
   //Returns a HashMap where the keys are the characters of the String, and it's values are # of occurences of each character 
    private HashMap<Character, Integer> getCounts(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
           char myChar = s.charAt(i);
           map.put(s.charAt(i), map.getOrDefault(myChar, 0 ) + 1);
        }
        return map;
    }
