/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.BMI;
import model.normalCalculator;
import validate.vali;

public class View {
    public vali v = new vali();  // Initialize the vali object
    public BMI b = new BMI();
    public normalCalculator n = new normalCalculator();

    public void normalCalculato() {
        System.out.print("Enter number: ");
        n.setMemory(v.checkInputDouble());       
        double memory = n.getMemory();
        while (true) {
            System.out.print("Enter operator: ");
            n.setOperator(v.checkInputOperator());
           
            String operator = n.getOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += v.inputNumber();
                n.setMemory(memory);
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= v.inputNumber();
                n.setMemory(memory);
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= v.inputNumber();
                n.setMemory(memory);
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= v.inputNumber();
                n.setMemory(memory);
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, v.inputNumber());
                n.setMemory(memory);
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                n.setMemory(memory);
                System.out.println("Result: " + memory);
                return;
            }
        }
    }


    //display result BMI status
    public  String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    //allow user BMI calculator
    public  void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        b.setWeith(v.checkInputDouble());
        double weight =b.getWeith();
        System.out.print("Enter Height(cm): ");
        b.setHeigth(v.checkInputDouble());
        double height = b.getHeigth();
        b.setBmi(weight*10000 / (height*height));
           double bmi = b.getBmi();
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
}  

