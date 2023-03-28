package DataStructures.Stack;
import java.util.Scanner;
import java.util.Stack;

public class FolderStructure {

    static Stack<String> stack = new Stack<>();
    static Scanner s = new Scanner(System.in);

    String[][] folder = new String[0][0];

    public void addFolder(String folderName) {
        stack.push(folderName);
    }

    public void removeFolder(String folderName) {

        Stack<String> extra = new Stack();

        for (Integer i = stack.search(folderName); i != 0; i--) {
            extra.push(stack.pop());
        };
        extra.pop();
        if (!stack.empty()) {
            extra.push(stack.pop());
        }

        for (Integer i = extra.size(); i != 0; i--) {
            stack.push(extra.pop());
        }


    }

    public void advanceFolder(String folderName) {

    }

    public void returnFolder(String folderName) {

    }

    /*
     * stack.push($ELEMENT$); - Adds elements on top (at the end) of the stack
     * stack.pop(); - Removes elements from the end of the stack
     * stack.empty(); - Returns boolean for whether the stack is empty or not
     * stack.search(); - Returns the position, from top to bottom, of a specific element in the stack.
     * stack.peek(); - Returns the element that resides on the top of a stack.
     * */

    // You can assign the value of the element you removed using stack.pop(); to a variable.



}
