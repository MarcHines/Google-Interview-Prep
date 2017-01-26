/*
Given an array of integers, return a list of list containing integers,
where all list are permutations of the given array

*/

import java.util.*;


public class ArrayPermutations{


    public static void main(String args[]){
	      int array[] = {2,3,4};
        ArrayList<ArrayList<Integer>> list = ArrayPermutations(array);
    
        for(ArrayList<Integer> l : list){
	       System.out.print("[ " );
         
	      for(int i : l) System.out.print(i + ",");
           System.out.print(" ]\n");
        }
    }

    public static ArrayList<ArrayList<Integer>> ArrayPermutations(int arr[]){
	StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i : arr) sb.append(i);

        ArrayList<String> temp =  permute("", sb.toString(),new ArrayList<>());  //24
        
        for(String s : temp){
	    ArrayList<Integer> tempList = new ArrayList<>();

	    for(int j = 0; j < s.length(); j++){
	     tempList.add(Integer.parseInt(s.charAt(j) + ""));
            }
         result.add(tempList);
        }
	 return result;
    }


    private static ArrayList<String> permute(String prefix, String str, ArrayList<String> list){
	if(str.length() == 0) list.add(prefix);

        for(int i = 0; i < str.length(); i++){
	    char currentChar = str.charAt(i);
            permute(prefix + currentChar, str.substring(0, i) + str.substring(i + 1), list);

        }

	return list;
   }
}

