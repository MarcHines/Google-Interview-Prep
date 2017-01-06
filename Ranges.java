/*
  Given an array of numbers, return a single String of comma seperated range of numbers not inside of the array. 
  ie. INPUT: Array[50,75]   OUTPUT: "0-49,51-74,76-100";
*/

import java.util.*;
public class GooglePrep {
    public static void main(String[] args) {
        int arr[] = {50,75,85,94};
        String result = ranges(arr);
        
        System.out.println(result);
    }
    
//The Solution Method
    public static String ranges(int arr[]){
       //We want to sort our input array, so that our ranges will be in the correct order. We will hold our 'ranges' in an array of SB's
        Arrays.sort(arr);
        StringBuilder stringB[] = new StringBuilder[arr.length + 1];
        
        for(int i = 0; i < arr.length; i++){
          StringBuilder sb = new StringBuilder();
          
         //The beginning will always start @ 0 and end at the first indexes value - 1
          int  start = 0;
          int  end = arr[i] - 1;
       
         //If we are not longer at the beginning, then the start of the range is always the last indexes value + 1, and we end at current index value - 1
          if(i > 0){
           start = arr[i - 1] + 1;
           end = arr[i] - 1;
          }
         //We build our result as object and store them in an array.
          sb.append(start).append("-").append(end);
          stringB[i] = sb;
          
         //Once we are at the end of our array, the the range always ends at 100, and starts at the last indexs value + 1 
          if(i == arr.length -1)
            stringB[arr.length] = new StringBuilder().append(arr[i] + 1).append("-").append(100);
        }
        
        StringBuilder result =  new StringBuilder();
        
       //Now we can build our result by appending each element in the array together, and seperating by a comma.
        for(StringBuilder s : stringB)
          result.append(s).append(",");
       
       //We just need to delete the last ',' from our String before we return so that we can have the desired result  
        return new String(result.deleteCharAt(result.length() - 1 ));
  }
}

