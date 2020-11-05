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
public class Recipe {
    private ArrayList<String> ingredients;
    private String name;
    private int time;
    
    public Recipe(String n, int t, ArrayList<String> i) {
        this.ingredients = i;
        this.name = n;
        this.time = t;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    
}
