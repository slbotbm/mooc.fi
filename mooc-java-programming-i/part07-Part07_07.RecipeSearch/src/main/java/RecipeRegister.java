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
public class RecipeRegister {
    private ArrayList<Recipe> recipes;
    
    public RecipeRegister() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public String toString() {
        String toReturn = "";
        if (!recipes.isEmpty()) {
            for (Recipe recipe : recipes) {
                toReturn += recipe.toString() + "\n";
            }
        } else {
            return toReturn;
        }
        return toReturn.substring(0, toReturn.length());
    }
    
    public ArrayList<Recipe> getRegister () {
        return this.recipes;
    }
}
