package Java_tasks_givenby_satish;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of rows for the triangle
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the inverted triangle
        for (int i = rows; i >= 1; i--) {
            // Loop for leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");  // print space
            }
            // Loop to print stars in each row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");  // print star
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
