/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slbotbm
 */
public class Archive {
    
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier () {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
}
