package Resolved01;

import java.util.Locale;
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four password numbers: ");
        String passwordStr = sc.nextLine();
        sc.close();


        if (passwordStr.length() != 4 || !passwordStr.matches("\\d{4}")) {
            System.out.println("Invalid password. Please enter a four-digit number.");
            return;
        }

        int numberPassword = Integer.parseInt(passwordStr);
        int brokenPassword = 0;
        int attemptCounter = 0;

        double startTime = System.currentTimeMillis();

        while (brokenPassword != numberPassword) {
            brokenPassword = (int) (Math.random() * 10000);
            attemptCounter++;
        }

        double timeToken = (System.currentTimeMillis() - startTime) / 1000;

        System.out.println("Number of attempts: " + attemptCounter);
        System.out.printf("Time taken: %f seconds \n", timeToken);

    }
}