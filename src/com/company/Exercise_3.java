/* Write a program that prompts the user to input an integer and then outputs
the number with the digits reversed */

package com.company;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), revese = 0;
        do {
            revese = revese * 10;
            revese = revese + number % 10;
            number = number / 10;
        } while (number != 0);
        System.out.println(revese);
    }
}
