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
public class Suitcase {
    private int mWeight;
    private ArrayList<Item> items;
    private int weight;
    
    public Suitcase(int w){
        this.mWeight = w;
        this.items = new ArrayList<>();

        
    }
    
    public void addItem(Item item) {
        int weight = 0;
        for (Item i : this.items) {
            weight += i.getWeight();
        }
        if ((weight + item.getWeight()) <= this.mWeight) {
            this.items.add(item);

        }
    }
    
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + weight + " kg)";
        }
        return this.items.size() + " items (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
