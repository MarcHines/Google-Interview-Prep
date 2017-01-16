/*Given a String in the format "3(abc)2(df)" return the String in the format "abcabcabcdfdf" */

import java.util.*;
import java.util.regex.*;
       
public class Decompression{
  public static void main(String args[]){
    String str = "2(abc)3(df)5(g)2(hijk)";
    String result = decompression(str);
    
    System.out.println("Before Decompression : " + str);
    System.out.println("After Decompression : " + result);
  }
   
    public String decompression(String input) {
        StringBuilder sb = new StringBuilder();
        Pattern ptn = Pattern.compile("[0-9][\\(][a-zA-Z]*[\\)]");
        Matcher match = ptn.matcher(input);
        
        while(match.find()){
          int multiplier = Integer.parseInt(match.group().charAt(0) + ""); 
          String sequence[] = match.group().split("[0-9]\\(");
          
          for(int i = 0; i < multiplier; i++){
            sb.append(sequence[1]);
            sb.deleteCharAt(sb.length() - 1);
          }
            
        }
    
    return sb.toString();
    }    
  }
