/*
  Given an array of numbers, return a single String of comma seperated range of numbers not inside of the array. 
  ie. INPUT: Array[50,75]   OUTPUT: "0-49,51-74,76-100";
-----------------------------
*/

import java.util.*;
public class GooglePrep {
    public static void main(String[] args) {
        int arr[] = {50,75,85,94};
        String result = ranges(arr);
      
        System.out.println(result);
    }
  
//Takes array and returns a String representation of the ranges of numbers not in the array; where the range is 0 < Range < stoppingPoint
    public static String ranges(int arr[], int stoppingPoint){
        Arrays.sort(arr);
        StringBuilder[] ranges = new StringBuilder[arr.length + 1];
        
        for(int index = 0; index < arr.length; index++){
            StringBuilder sb = new StringBuilder();
            int  start = 0;
            int  end = arr[index] - 1;
       
            if(index > 0){
             start = arr[index - 1] + 1;
             end = arr[index] - 1;
            }
          
            ranges[index] =  sb.append(start).append("-").append(end);
          
            if(index == arr.length - 1)
              ranges[arr.length] = new StringBuilder().append(arr[index] + 1).append("-").append(stoppingPoint); 
          
          }//End of loop
      
        StringBuilder result =  new StringBuilder();
        for(StringBuilder s : ranges)
          result.append(s).append(",");
       
        return new String(result.deleteCharAt(result.length() - 1 ));
  }
}

