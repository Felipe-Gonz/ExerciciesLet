package org.example.easy;

import java.util.Stack;

public class Parentheses {


    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char top;
        for(int i = 0; i < s.length();i++ ){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()){
                    return false;
                }
                top = stack.pop();
                if (c == ')' && top != '('){
                    return false;
                }
                if (c == ']' && top != '['){
                    return false;
                }
                if (c == '}' && top != '{'){
                    return false;
                }
            }



        }
        return stack.empty();
    }

}
