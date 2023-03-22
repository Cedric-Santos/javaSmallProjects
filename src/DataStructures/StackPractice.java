package DataStructures;

import java.util.Stack;

public class StackPractice {

    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        /*
        * stack.push($ELEMENT$); - Adds elements on top (at the end) of the stack
        * stack.pop(); - Removes elements from the end of the stack
        * stack.empty(); - Returns boolean for wheter the stack is empty or not
        * stack.search(); - Returns the position, from top to bottom, of a specific element in the stack.
        * stack.peek(); - Returns the element that resides on the top of a stack.
        * */

        // You can assign the value of the element you removed using stack.pop(); to a variable.

        System.out.println(stack.peek());
    }




}
