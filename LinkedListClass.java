/**
 * @author Fareesa Syeda
 * syedaf@merrimack.edu
 * CSC 6301 - Software Design and Documentation
 * @version 1.0.0
 * @since Week 4 Project
 * The java implementation of a Linked List class using java utility package.
 */

/**
 * Steps taken to run the program on the command line:
 * pwd
 * "cd / path to directory" to go inside "src" folder
 * .java file compiled using this command: "javac LinkedListClass.java"
 * program was run using this command: "java LinkedListClass"
 * javadocs was created using this command: go inside "src" folder and type: "javadoc -d javadocs LinkedListClass.java"
 */

import java.util.LinkedList; // import LinkedList class from java utility package.
import java.util.ListIterator; // import ListIterator interface from java utility package.
import java.util.Scanner; // import Scanner class from java utility package.
import java.util.Collections; // import Collections class from java utility package. 

/** 
 * This simple class represents a LinkedList class using the java collections framework.
 * It reads a list of integers from user.
 * It stores this list of integers.
 * It sorts the list of integers in ascending order.
 */
public class LinkedListClass {
/**
 * The main entry point of the application that executes the program.
 * @param args The command-line arguments.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //open scanner
        LinkedList<Integer> list = new LinkedList<>();

        // Scanner implemented to read numbers from user input
        System.out.println("Enter a list of integer numbers, separated by a space, then type any letter when finished, press enter:");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Sort the list using java collections framework
        Collections.sort(list);

        // Print the sorted list using ListIterator
        System.out.println("Sorted list:");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        scanner.close(); //close scanner
    }
}
