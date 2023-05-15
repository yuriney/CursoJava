package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a;
        String x;
        double b;

        //sc.next(); one word only
        //sc.nextLine();  that'll read the whole line
        x = sc.next();
        System.out.println("Você digitou: " + x);


        a = sc.nextInt();
        System.out.println("você digitou: " + a);

        b = sc.nextDouble();
        System.out.println("você digitou: " + b);
        sc.close();
    }
}