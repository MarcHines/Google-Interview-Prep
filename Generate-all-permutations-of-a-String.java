/*Generate all possible permutaions of a given String */

/* It's akward to have a function take an empty String as input, so we will just have the first function call the other function,
so that the user of the function can simply enter the String they wish to permute. The idea is to fix the first character at the
beginning of the String, and swap all other chars around position by position, ie. "abcd"  =>  Abcd -> Acbd ->. Notice the A is fixed
and the all other chars are swapped on at a time. Then we fixed the next char in the String's next index AT THE BEGINNING of the String 
and repeat the process. The recursive solution below seems a bit magical, but we are doing the above mentioned algorithm: 
*NOTE : we are placeing results in a set as not to get repeated permutations when we have a String such as "Too".*/



    public static HashSet<String> permutations(String s){
        return permutations("", s, new HashSet<String>());
     }

    public static HashSet<String> permutations(String prefix, String str, HashSet<String> set){
        if(str.length() == 0) set.add(prefix);
        
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            permutations(prefix + currentChar, str.substring(0,i) + str.substring(i+1), set);
        }
        return set;
    }
