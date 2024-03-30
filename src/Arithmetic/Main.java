package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("Enter first number: ");
        Number num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Number num2 = scanner.nextDouble();

        Arithmetic arithmetic = new Arithmetic(num1, num2);

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add 2. Subtract 3. Multiply");
            System.out.println("4. Divide 5. Get Min 6. Get Max");
            System.out.println("7. Change Values 0. Exit");

            choice = scanner.nextInt();

            if (choice != 0) {


                switch (choice) {
                    case 1:
                        System.out.println("Result: " + arithmetic.add());
                        break;
                    case 2:
                        System.out.println("Result: " + arithmetic.subtract());
                        break;
                    case 3:
                        System.out.println("Result: " + arithmetic.multiply());
                        break;
                    case 4:
                        System.out.println("Result: " + arithmetic.divide());
                        break;
                    case 5:
                        System.out.println("Min: " + arithmetic.getMin());
                        break;
                    case 6:
                        System.out.println("Max: " + arithmetic.getMax());
                        break;
                    case 7:
                        System.out.print("Enter new first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter new second number: ");
                        num2 = scanner.nextDouble();
                        arithmetic = new Arithmetic(num1, num2);
                        System.out.println("Values changed successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 0);

        System.out.println("Exiting program. Thank you!");
    }
}
