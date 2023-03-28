package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintQueue {

    private static final int ADD_FILE = 1;
    private static final int REMOVE_FILE = 2;
    private static final int START_PRINT = 3;
    private static final int CHECK_HEAD = 4;
    private static final int EXIT = 5;

    static Queue<String> queue = new LinkedList<String>();

    protected static Integer app(Integer check, Scanner s) {
            do {
                System.out.println("\n1 - Add New File into Queue\n" +
                        "2 - Remove Existing File From Queue\n" +
                        "3 - Start Printing\n" +
                        "4 - Check File at the Head of the Queue\n" +
                        "5 - Exit\n");
                check = s.nextInt();
            } while (check < ADD_FILE || check > EXIT);

            return check;

        }

    protected static void utilize(Integer check, Scanner s) {

        switch (check) {
            case ADD_FILE -> {
                System.out.println("\nFile Name?\n");
                PrintQueue.addPrint(s.next());
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }
            case REMOVE_FILE -> {
                if (queue.isEmpty()) {
                    System.out.println("\n*****No Files Currently Waiting for Priting*****\n");
                } else {
                    PrintQueue.removePrint();
                }
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }
            case START_PRINT -> {
                PrintQueue.startPrint();
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }
            case CHECK_HEAD -> {
                PrintQueue.checkHead();
                check = PrintQueue.app(check, s);
                PrintQueue.utilize(check, s);
            }

            case EXIT -> System.out.println("\n*****Closing Software*****\n");
        }

    }

    public static void addPrint (String pdf) {
        queue.offer(pdf);
    }

    public static void removePrint () {
        System.out.println("\n*****Removing File*****\n" + queue.poll() +
                           "\n***********************");
    }

    public static void startPrint () {
        if (!queue.isEmpty()) {
            System.out.println("\n\n*****Starting Printing Process*****\n");
            do {
                System.out.println("1 New Printed File: " + queue.poll());
            } while (!queue.isEmpty());
        } else {
            System.out.println("*****EMPTY*****");
        }
    }

    public static void checkHead () {
        if (queue.isEmpty()) {
            System.out.println("*****EMPTY*****");
        } else {
            System.out.println("\n*****First Item at Queue*****\n" + queue.peek() +
                               "\n*****************************");
        };
    }


}
