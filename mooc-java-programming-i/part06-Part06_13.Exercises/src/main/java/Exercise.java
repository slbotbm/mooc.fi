/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slbotbm
 */
public class Exercise {
    
    private String name;
    private boolean completed;
    
    public Exercise(String name) {
        this.name = name;
        this.completed = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isCompleted() {
        return this.completed;
    }
    
    public void setComleted(boolean completed) {
        this.completed = completed;
    }
    
}
