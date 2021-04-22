/* Write a program that reads a set of integers, and then prints the sum of the
even and odd integers */

package com.company;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sumEven = 0, sumOdd = 0;
        boolean confirm;
        do {
            System.out.print("Enter a integer number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                sumEven = number + sumEven;
            } else {
                sumOdd = number + sumOdd;
            }
            System.out.print("Do you want to continue? true/false: ");
            confirm = scanner.nextBoolean();
        } while (confirm);
        System.out.println("The sum of even numbers: " + sumEven);
        System.out.println("The sum of odd numbers: " + sumOdd);
    }
}
