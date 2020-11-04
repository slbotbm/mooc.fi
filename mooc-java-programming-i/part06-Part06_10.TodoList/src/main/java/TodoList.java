/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slbotbm
 */
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> work;
    
    
    public TodoList () {
        this.work = new ArrayList<>();
    }
    
    public void add (String task) {
        this.work.add(task);
    }
    
    public void print() {
        int counter = 1;
        for (String task : this.work) {
            System.out.println(counter + ": " + task);
            counter++;
        }
    }
    
    public void remove(int number) {
        this.work.remove(number-1);
    }
}
