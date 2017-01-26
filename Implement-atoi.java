/*
Given a String return the Integer equivalent.

eg. "109" Returns (int) 109

*/

public static int atoi(String number){
      HashSet<Integer> set = new HashSet<>();
      for(int i = 0; i < 10; i++) set.add(i);

      boolean isNegative = number.charAt(0) == '-' ? true : false;
      int result = 0;
      
      for(int j = isNegative ? 1 : 0; j < number.length(); j++){
        char currentChar = number.charAt(j);
        if(set.contains(currentChar - '0'))
          result =(result * 10) +  currentChar - '0';
    }
    
      return isNegative ? -result : result;

    }
