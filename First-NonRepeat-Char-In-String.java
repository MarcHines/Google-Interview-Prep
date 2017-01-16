/*
 Write an efficient method to find the first non-repeated
 character in a string. Example: the first non-repeated character in “teeters” is “r”
*/

public static char firstNonRepeat(String str){
  HashMap<Character, Integer> map = getCounts(str);
  for(int j = 0; j < str.length(); j++){
    char currentChar = str.charAt(j);
    if(map.get(currentChar) == 1) return currentChar;
  }
  return ' ';
}

   //Returns a HashMap where the keys are the characters of the String, and it's values are # of occurences of each character 
    private static HashMap<Character, Integer> getCounts(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
           char myChar = s.charAt(i);
           map.put(s.charAt(i), map.getOrDefault(myChar, 0 ) + 1);
        }
        return map;
    }
}
