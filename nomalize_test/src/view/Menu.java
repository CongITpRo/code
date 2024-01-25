/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    String title;
    protected  ArrayList<T> abc;
    public Menu(){    
    }
    public Menu(String td , String[] mc){
        title = td;
        abc = new ArrayList<>();
        for (String s : mc) {
           abc.add((T) s);
        }
    }
    public void DisPlay(){
        System.out.println(title);
        System.out.println("------------------");
        for (int i = 0; i < abc.size(); i++) {
        System.out.println((i+1)+"."+abc.get(i));
        System.out.println("------------------");  
        }
    }
    public int Getselection(){
        DisPlay();
        Scanner ip = new Scanner(System.in);
        System.out.println("your choise is :"); 
        return ip.nextInt();
    }
    public abstract void select(int n);
    
    public void run(){
        while (true){
            int n = Getselection();
            select(n);
            if (n> abc.size()) break;
        }
    }
    
    
}


