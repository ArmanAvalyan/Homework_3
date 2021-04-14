/* Exercise_1
Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        boolean choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.print("Do you want to continue? true/false: ");
            choice = scanner.nextBoolean();
        } while (choice);
        System.out.printf("\nPositive numbers: %s \nNegative numbers: %s \nZero numbers: %s", positive, negative, zero);
    }
}
