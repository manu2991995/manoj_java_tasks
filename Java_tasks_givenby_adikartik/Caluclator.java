package Java_tasks_givenby_adikartik;

import java.util.Scanner;

public class Caluclator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing calculations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        // Displaying results
        System.out.println("Results:");
        System.out.println("Adavance_java_individual_tasks_givenby_praveen.Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }

}
