/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import view.Menu;
import view.danhba;

public class contro extends Menu{
    danhba duc = new danhba();
    ArrayList lc = new ArrayList();
     public contro(){
        super("Contact program  ", new String[]{"Add a Contact","Display all Contact","Delete a Contact","exit"});
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                duc.createContact(lc);
                break;
            case 2:
                duc.printAllContact(lc);
                break;
            case 3:
                duc.deleteContactd(lc);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Enter 1-> 4");
                break;
        }
    }
    
}
