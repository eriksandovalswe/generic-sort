/*
Erik Sandoval
COSC 2336-01
Instructor: Professor Liu
Programming Assignment 2
Due: Feb 7th, 2022 - 11:59PM
Submitted: Feb 7th, 2022
This program will sort two array lists, one of integers and one of strings. The program will accomplish this by
using the generic sort method. The program will then print out the sorted array lists. This program contains the
class GenericSortErikSandoval.java. It also contains the main method and the generic sort method. Required imports are
ArrayList and Scanner. The generic sort method is used to sort the array lists. The main method is used to call the
generic sort method and print out the sorted array lists.
Amazon Corretto 17.0.2
Java
 */



import java.util.ArrayList; // Import the ArrayList class
import java.util.Scanner; // Import the Scanner class


public class GenericSortErikSandoval { // Create a class called GenericSortErikSandoval
    static Scanner input = new Scanner(System.in); // Create a scanner called input

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        // Create a generic method called sort that takes an ArrayList of type E as a parameter

        int n = list.size(); // size of list
        for (int i = 0; i < n - 1; i++) { // outer loop
            for (int j = 0; j < n - i - 1; j++) { // inner loop
                // if the element at index j is greater than the element at index j + 1, swap them
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    E temp = list.get(j); // store the element at index j in temp variable
                    list.set(j, list.get(j + 1)); // set the element at index j to the element at index j + 1
                    list.set(j + 1, temp); // set the element at index j + 1 to the element stored in temp
                }
            }
        }
    }
    public static void main(String[] args) { // Create a main method
        System.out.println("Enter 10 integers: "); // Prompt the user to enter 10 integers
        ArrayList<Integer> list = new ArrayList<>(); // Create an ArrayList of type Integer called list
        for (int i = 0; i < 10; i++) { // loop 10 times
            list.add(Integer.parseInt(input.next())); // add the next integer to the list
        }
        sort(list); // call the sort method on list
        System.out.println("Sorted list: " + list); // print the sorted list

        System.out.println("Enter 5 strings: "); // Prompt the user to enter 5 strings
        ArrayList<String> list2 = new ArrayList<>(); // Create an ArrayList of type String called list2
        for (int i = 0; i < 5; i++) { // loop 5 times this time instead of 10 times
            list2.add(input.next()); // add the next string to the list2, same as with integers earlier
        }
        sort(list2); // call the sort method again, but this time on list2
        System.out.println("Sorted list: " + list2); // print the sorted list

    }
}