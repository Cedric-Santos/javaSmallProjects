package DataStructures.Stack;

import java.util.Scanner;

public class FileStackExercise {

    static Scanner s = new Scanner(System.in);
    static Integer choice;

    public static void main(String args[]) {

        FolderStructure folderStructure = new FolderStructure();

        System.out.println("\nWelcome to the File System!!\n\n" + "" +
                           "Choose an Option:\n" +
                           "1 - Add New Folder\n" +
                           "2 - Remove a Folder\n" +
                           "3 - Check Folders" );
        choice = s.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Name Your Folder");
                folderStructure.addFolder(s.next());
            }
            case 2 -> {
                System.out.println("Folder Name");
                folderStructure.removeFolder(s.next());
            }
            case 3 -> {
                System.out.println(FolderStructure.stack);
            }
            default -> {}
        }
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
