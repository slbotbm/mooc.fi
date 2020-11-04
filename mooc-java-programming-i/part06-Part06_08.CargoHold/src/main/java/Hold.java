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

public class Hold {
    
    private int mWeight;
    private ArrayList<Suitcase> cases;
    
    public Hold (int mW) {
        this.mWeight = mW;
        this.cases = new ArrayList<>();
    }
    
    public void addSuitcase (Suitcase suitcase){
        int weight = 0;
        for (Suitcase c : this.cases) {
        weight+= c.totalWeight();
        }
        if ((weight + suitcase.totalWeight()) <= mWeight) {
            this.cases.add(suitcase); 
        }
    }
    
    public String toString () {
        int weight = 0;
        for (Suitcase c : this.cases) {
        weight+= c.totalWeight();
        }
        
        return this.cases.size() + " suitcases (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase c : this.cases) {
            c.printItems();
        }
    }
    
}
