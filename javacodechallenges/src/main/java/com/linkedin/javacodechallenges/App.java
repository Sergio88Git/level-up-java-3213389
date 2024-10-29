package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.math.*;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        final double gallonPerCcf = 748;
        final double minimumWaterBill = 18.84;
        final double priceExtraCcf = 3.90;
        double numberExtraCcf = 0;

        if (gallonsUsage > 2 * gallonPerCcf) {
            numberExtraCcf = Math.ceil((gallonsUsage - 2 * gallonPerCcf) / gallonPerCcf);
        }
        return (minimumWaterBill + numberExtraCcf * priceExtraCcf);

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
