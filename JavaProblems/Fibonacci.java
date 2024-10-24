/*
 * Problem: Fibonacci Sequence
 * Description: Write a program to print the first n numbers in the Fibonacci sequence, 
 * where n is provided by the user. The Fibonacci sequence starts with 0 and 1, and each 
 * subsequent number is the sum of the previous two.
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + (i < n - 1 ? ", " : ""));
            
            // Compute the next number in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
