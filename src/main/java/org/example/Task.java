package org.example;

import java.util.Scanner;

public class Task {
    Scanner input = new Scanner(System.in);

    public Task() {
        System.out.println("""
                Choose method:
                1. printThreeWords
                2. checkSumSign
                3. printColor""");
        switch (input.nextInt()) {
            case 1 -> printThreeWords();
            case 2 -> checkSumSign();
            case 3 -> printColor();
        }
    }

    private void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    private void checkSumSign() {
        System.out.print("Enter first num = ");
        int firstNum = input.nextInt();
        System.out.print("\nEnter second num = ");
        int secondNum = input.nextInt();

        if (firstNum + secondNum > 0) {
            System.out.println("Sum positive");
        } else if (firstNum + secondNum < 0) {
            System.out.println("Sum negative");
        } else {
            System.out.println("Sum equals 0");
        }
    }

    private void printColor() {
        System.out.print("Enter Value == ");
        int value = input.nextInt();

        if (value <= 0) {
            System.out.println("Red");
        } else if (value < 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    private void compareNumbers() {
        System.out.print("Enter first num = ");
        int firstNum = input.nextInt();
        System.out.print("\nEnter second num = ");
        int secondNum = input.nextInt();

        if (firstNum >= secondNum) {
            System.out.println(firstNum + " >= " + secondNum);
        } else {
            System.out.println(firstNum + " < " + secondNum);
        }
    }
}
