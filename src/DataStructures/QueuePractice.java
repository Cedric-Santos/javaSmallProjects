package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueuePractice {

    Scanner s = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<String>();

    public static void addPDF (String[] pdf) {
        for(Integer i = 0; i < pdf.length; i++) {
            queue.offer(pdf[i]);
        }
    }

    public static void removePDF (String[] pdf) {
        while (!queue.isEmpty()) {
            queue.poll();
        }
    }

    public static void main (String args[]) {

        String[] cars = {"Volvo", "BMW", "Audi", "Toyota", "Volkswagen"};

        addPDF(cars);

        System.out.println(queue);

        removePDF(cars);

        System.out.println(queue.isEmpty());

    }




//Offer(), Poll(), Peek()


}
