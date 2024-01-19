/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.Hashtable;
import model.Fruit;
import model.Order;
import view.Menu;
import view.viewFruit;

public class fruitshop extends Menu{
    public viewFruit v = new viewFruit();
     ArrayList<Fruit> lf = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> ht = new Hashtable<>();
    public fruitshop(){
        super("Fruit system", new String[]{"creat","view","shoping","exit"});
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                v.createFruit(lf);
                break;
            case 2:
                v.viewOrder(ht);
                break;
            case 3:
                v.shopping(lf, ht);
                break;
            case 4:  
                
                break;
                
        }
    }
    
}
