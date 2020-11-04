
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        for (int num : numbers){
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    } 
    
}
