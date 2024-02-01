/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import static java.lang.System.in;
import java.util.Scanner;

public class vali {

    public Scanner in = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble() {

        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }

    }

    public String checkInputOperator() {

        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }
    public double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputDouble();
        return number;
    }
}
