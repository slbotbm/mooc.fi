/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slbotbm
 */
public class Bird {
    private String name;
    private String latin;
    private int obs;
    
    public Bird (String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.obs = 0;
    }
    
    public String toString() {
        return name + " (" + this.latin + "): " + this.obs + " observations";
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getObservation() {
        return this.obs;
    }
    
    public void increaseObservation() {
        this.obs++;
    }
    
}
