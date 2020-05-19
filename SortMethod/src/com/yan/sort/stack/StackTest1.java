package com.yan.sort.stack;

import java.util.HashMap;
import java.util.Stack;

public class StackTest1 {

//    public static boolean isValid(String s){
//        if (s.isEmpty()){
//            return false;
//        }
//        //1. 通过一个Map 存储对应关系
//        Map<Character,Character> keyMap = new HashMap<>();
//        keyMap.put('}','{');
//        keyMap.put(')','(');
//        keyMap.put(']','[');
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0 ; i<s.length();i++){
//            char key = s.charAt(i);
//            if (keyMap.containsKey(key)){
//                char element = stack.empty() ? '#' : stack.pop();
//                if (element != keyMap.get(key)){
//                    return false;
//                }
//            }else {
//                stack.push(key);
//
//            }
//        }
//        return stack.empty();
//    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }

            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }


    public static void main(String args[]){
       boolean flag =  isValid("[]()");
       System.out.println("flag = " +flag);
    }
}
