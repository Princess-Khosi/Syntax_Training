package com.example.gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
    }
}