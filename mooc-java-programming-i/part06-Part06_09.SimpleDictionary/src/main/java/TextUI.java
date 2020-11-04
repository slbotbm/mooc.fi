/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slbotbm
 */
import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI (Scanner s, SimpleDictionary sD) {
        this.scanner = s;
        this.simpleDict = sD;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String answer = scanner.nextLine();
            if (answer.equals("end")) {
                break;
            } else if (answer.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String trans = scanner.nextLine();
                simpleDict.add(word, trans);
            } else if (answer.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String trans = simpleDict.translate(word);
                if (trans == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + simpleDict.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
    
}
