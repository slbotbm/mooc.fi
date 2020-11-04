
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String var = "The collection " + this.name +" has " + this.elements.size()+ " element:";
            for (String element : this.elements) {
                var += "\n" + element;
            }
            return var;
        }
    }
    
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String longest = this.elements.get(0);
        
        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }
        
    
    

}
