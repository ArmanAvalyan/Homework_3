/* Write a program that reads a set of integers, and then prints the sum of the
even and odd integers */

package com.company;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sumEven = i + sumEven;
            } else  {
                sumOdd = i + sumOdd;
            }
        }
        System.out.println("The sum of even numbers: " + sumEven);
        System.out.println("The sum of odd numbers: " + sumOdd);
    }
}
