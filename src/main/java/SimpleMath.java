/*
 *  UCF COP3330 Fall 2021 Exercise 5 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class SimpleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String inputOne = input.nextLine();
        System.out.print("What is the second number? ");
        String inputTwo = input.nextLine();

        int numOne = Integer.parseInt(inputOne);
        int numTwo = Integer.parseInt(inputTwo);

        int add = numOne + numTwo;
        int diff = numOne - numTwo;
        int mult = numOne * numTwo;
        int div = numOne / numTwo;

        String output = String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", numOne, numTwo, add, numOne, numTwo, diff, numOne, numTwo, mult, numOne, numTwo, div);
        System.out.println(output);
    }
}
