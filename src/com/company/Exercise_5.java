//Create a function that counts the integer's number of digits

package com.company;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(), amount = 0;
        do {
            number = number / 10;
            amount++;
        } while (number != 0);
        System.out.println("Amount: " + amount);
    }
}
