/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class BMI {
    public double weith;
    public double heigth;
    public double bmi;

    public BMI() {
    }
   
    
    public BMI(double weith, double heigth, double bmi) {
        this.weith = weith;
        this.heigth = heigth;
        this.bmi = bmi;
    }

    public double getWeith() {
        return weith;
    }

    public void setWeith(double weith) {
        this.weith = weith;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    
}
