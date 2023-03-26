package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueuePractice {

    static Scanner s = new Scanner(System.in);
    static PrintQueue printSystem = new PrintQueue();

    static Integer check;

    public static void main (String args[]) {


        System.out.println("\nWelcome to the Printer!!!\n");
        check = PrintQueue.app(check, s);
        PrintQueue.utilize(check, s);

    }




//Offer(), Poll(), Peek()


}
