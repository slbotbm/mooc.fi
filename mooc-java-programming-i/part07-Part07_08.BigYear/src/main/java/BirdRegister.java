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
public class BirdRegister {
    private ArrayList<Bird> birds;
    
    public BirdRegister() {
        this.birds = new ArrayList<>();
    }
    
    public String toString() {
        String str = "";
        if (birds.size() > 0) {
            for (Bird bird : birds) {
                str += bird.toString() + "\n";
            }
            return str.substring(0, str.length()-2);
        }
        return "";
    }
    
    public void add(Bird bird) {
        this.birds.add(bird);
    }
    
    public ArrayList<String> getBirdNames() {
        ArrayList<String> temp = new ArrayList<>();
        for (Bird bird : this.birds) {
            temp.add(bird.getName());
        }
        return temp;
    }
    
    public ArrayList<Bird> getList() {
        return this.birds;
    }
    
    public String getBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return bird.toString();
            }
        }
        return "";
    }
}
        
    

