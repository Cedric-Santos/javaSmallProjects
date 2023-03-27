package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintQueue {

    static Queue<String> queue = new LinkedList<String>();

    protected static Integer app(Integer check, Scanner s) {

        System.out.println("\n*****Select an Option Ahead*****\n");
        System.out.println("1 - Add New File into Queue\n" +
                "2 - Remove Existing File From Queue\n" +
                "3 - Start Printing\n" +
                "4 - Check File at the Head of the Queue\n" +
                "5 - Exit\n");

        check = s.nextInt();

        if (check < 1 || check > 5) {

            do {
                System.out.println("1 - Add New File into Queue\n" +
                        "2 - Remove Existing File From Queue\n" +
                        "3 - Start Printing\n" +
                        "4 - Check File at the Head of the Queue\n" +
                        "5 - Exit\n");
                check = s.nextInt();
            } while (check < 1 || check > 5);

        }

        return check;
    }

    protected static void utilize(Integer check, Scanner s) {

        switch (check) {
            case 1 -> {
                System.out.println("\nFile Name?\n");
                PrintQueue.addPrint(s.next());
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }
            case 2 -> {
                if (queue.isEmpty()) {
                    System.out.println("\n*****No Files Currently Waiting for Priting*****\n");
                    check = PrintQueue.app(check, s);
                    PrintQueue.utilize(check, s);
                } else {
                    PrintQueue.removePrint();
                    check = PrintQueue.app(check, s);
                    PrintQueue.utilize(check, s);
                }
            }
            case 3 -> {
                PrintQueue.startPrint();
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }
            case 4 -> {
                PrintQueue.checkHead();
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }

            case 5 -> System.out.println("\n*****Closing Software*****\n");
        }

    }

    protected static void addPrint (String pdf) {
        queue.offer(pdf);
    }

    protected static void removePrint () {
        System.out.println("\n*****Removing File*****\n" + queue.poll() + "\n***********************");
    }

    protected static void startPrint () {
        System.out.println("\n\n*****Starting Printing Process*****\n");
        do {
            System.out.println("1 New Printed File: " + queue.poll());
        } while (!queue.isEmpty());
    }

    protected static void checkHead () {
        if (queue.isEmpty()) {
            System.out.println("*****EMPTY*****");
        } else {
            System.out.println("\n*****First Item at Queue*****\n" + queue.peek() +
                               "\n*****************************");

        };
    }


}
