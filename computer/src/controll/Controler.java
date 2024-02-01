/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controll;

import view.Menu;
import view.View;

public class Controler extends Menu{
    public View v = new View();
    public Controler(){
        super("Calculator Program ", new String[]{"Normal Calculator","BMI Calculator","exit"});
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                v.normalCalculato();
                break;
            case 2:    
                v.BMICalculator();
                break;
            case 3: 
                System.exit(0);
                break;                         
            default:
                System.out.println("Enter in 1->3");
                break;
        }
    }
    
}

