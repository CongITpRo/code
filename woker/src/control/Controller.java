/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.ArrayList;
import model.History;
import model.Worker;
import view.Menu;
import view.View;
public class Controller extends Menu{
    public View View = new View();
    ArrayList<Worker> lw = new ArrayList<>();
    ArrayList<History> lh = new ArrayList<>();
    public Controller() {
        super("========== Worker Management  ==========", new String[]{"1.Add Worker", "2.Up salary", "3.Down salary", "4.Display Information salary", "5.Exit"});
    }
    @Override
    public void execute(int n) {
        switch (n){
                case 1:
                   View.addWorker(lw);
                    break;
                case 2:
                   View.changeSalary(lw, lh, 1);
                    break;
                case 3:
                   View.changeSalary(lw, lh, 2);
                    break;
                case 4:
                   View.printListHistory(lh);
                    break;
                case 5:
                    return;
    }
    }    
    }
