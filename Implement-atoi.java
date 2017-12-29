/*
Given a String return the Integer equivalent.

eg. "109" Returns (int) 109

*/

public static int atoi(String number){
      boolean isNegative = number.charAt(0) == '-';
      int result = 0;
      
      for(int i = isNegative ? 1 : 0; i < number.length(); j++){
        if(Character.isDigit( number.charAt(i)))
          result =(result * 10) +  number.charAt(i) - '0';
    }
      return isNegative ? -result : result;
    }
