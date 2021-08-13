package com.arif;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        //for (int num = 1; num <= 5; num++)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        for (int num = 1; num <= n; num++)
            System.out.print(num + " ");
    }
}
