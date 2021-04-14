/* Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered */

package com.company;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max, min;
        boolean compare;
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        max = n;
        min = n;
        System.out.print("Do you want to continue? true/false?: ");
        compare = scanner.nextBoolean();
        while (compare) {
            System.out.print("Enter the number: ");
            int i = scanner.nextInt();
            System.out.print("Do you want to continue? true/false?: ");
            compare = scanner.nextBoolean();
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Max = %s \nMin = %s", max, min);
    }
}
