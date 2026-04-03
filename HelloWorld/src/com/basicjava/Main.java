package com.basicjava;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte MONTH = 12;
        final byte PERCENT = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterrest = sc.nextFloat();
        float monthlyInterest = (annualInterrest / PERCENT) / MONTH;

        System.out.print("Period (Year): ");
        byte period = sc.nextByte();
        int numberOfPayment = period * MONTH;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);

        String currencyMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+currencyMortgage);

    }
}
