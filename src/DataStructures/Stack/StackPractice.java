package DataStructures.Stack;

import java.util.Stack;
import java.util.Scanner;

public class StackPractice {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        System.out.println("Type a word.");
        String chosenWord = s.next();
        String result = "";


        for(Integer i = chosenWord.length() - 1; i >= 0; i--) {
            stack.push(String.valueOf(chosenWord.charAt(i)));
            result += stack.pop();
        }


        System.out.println(result);

        /*
        * stack.push($ELEMENT$); - Adds elements on top (at the end) of the stack
        * stack.pop(); - Removes elements from the end of the stack
        * stack.empty(); - Returns boolean for wheter the stack is empty or not
        * stack.search(); - Returns the position, from top to bottom, of a specific element in the stack.
        * stack.peek(); - Returns the element that resides on the top of a stack.
        * */

        // You can assign the value of the element you removed using stack.pop(); to a variable.

    }




}
