/*Given a string, sort it in decreasing order based on the frequency of characters.  */

/*  
Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.

*/

    public String frequencySort(String s) {
      TreeSet<Letter> treeset = new TreeSet<>();
      HashSet<Character> set = new HashSet<>();
      HashMap<Character,Integer> map = getCounts(s);
      StringBuilder result = new StringBuilder();
      int index = 0;
      
      for(int i = 0; i < s.length(); i++) 
        set.add(s.charAt(i));
        
      for(Character c : set)
        treeset.add(new Letter(c, map.get(c)));
         
      for(Letter letter : treeset)
        for(int j = 0; j < letter.count; j++)
          result.append(letter.id);
      
      return result.toString();
    }
    
    //This method just counts occurences of characters and returns a map
    public static HashMap<Character,Integer> getCounts(String s){
      HashMap<Character, Integer> map = new HashMap<>();
      for(int i = 0; i < s.length(); i++)
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        
      return map;    
    }
}

 class Letter implements Comparable<Letter>{
    char id;
    int  count;
    
    public Letter(char id, int count){
        this.id = id;
        this.count = count;
    }
    
    public int compareTo(Letter other){
     if(this.count < other.count) return 1;
    return -1;
    }
