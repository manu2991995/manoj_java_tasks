package Java_tasks_givenby_adikartik;


    public class CalculatorLoop {
        public static void main(String[] args) {
            int num1 = 4;  // Example value, you can change it
            int num2 = 2;   // Example value, you can change it

            int choice = 1; // Initializing choice

            System.out.println("\nUsing while loop: ");
            while (choice <= 4) {
                performOperation(choice, num1, num2);
                choice++;
            }

            // Resetting choice for next loop
            choice = 1;

            // Using do-while loop to iterate over operations
            System.out.println("\nUsing do-while loop: ");
            do {
                performOperation(choice, num1, num2);
                choice++;
            } while (choice <= 4);
        }

        // Method to perform operation using switch-case
        public static void performOperation(int choice, int num1, int num2) {
            int result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                    break;

                default:
                    System.out.println("Invalid operation choice");
            }
        }
    }

