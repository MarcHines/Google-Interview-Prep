/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Hint: We know if the string has an odd length then it's not possible for it to be valid
*/

public boolean isValid(String s) {
        if(s.length() < 2 || s.length() % 2 == 1) return false;
        
        Stack<Character> open = new Stack<Character>();
        for(char brace : s.toCharArray()){
            switch(brace){
                case '(': open.push(')');
                break;
                
                case '[': open.push(']');
                break;
                
                case '{': open.push('}');
                break;
                
                default: if(open.isEmpty() || open.pop() != brace) return false; 
            }
        }
        
        return open.isEmpty();
    }
