/*
Given a String return the Integer equivalent.

eg. "109" Returns (int) 109

*/

public static int atoi(String number){
      boolean isNegative = number.charAt(0) == '-';
      int result = 0;
      
      for(int j = isNegative ? 1 : 0; j < number.length(); j++){
        char currentChar = number.charAt(j);
        if(Character.isDigit(currentChar))
          result =(result * 10) +  currentChar - '0';
    }
    
      return isNegative ? -result : result;

    }
