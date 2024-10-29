package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.math.*;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        final double ccf = 748;
        double numberCcf = 0;
        if (gallonsUsage > 2 * ccf) {
            numberCcf = Math.ceil((gallonsUsage - 2 * ccf) / ccf);

        }
        return (18.84 + numberCcf * 3.90);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
