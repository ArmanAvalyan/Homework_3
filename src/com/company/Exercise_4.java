/* Given an integer, create a function that returns the next prime. If the number is prime,
return the number itself */

package com.company;

import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number++;
            }
        }
        System.out.println("Prime number = " + number);
    }
}
