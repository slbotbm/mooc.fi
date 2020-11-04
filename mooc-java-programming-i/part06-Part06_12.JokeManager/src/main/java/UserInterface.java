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
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface (JokeManager j, Scanner s) {
        this.jokes = j;
        this.scanner = s;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:\n" + "1 - add a joke\n" + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop");
            String answer = scanner.nextLine();
            if (answer.equals("X")) {
                break;
            } else if (answer.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToAdd = scanner.nextLine();
                this.jokes.addJoke(jokeToAdd);
            } else if (answer.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if (answer.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
    }
}
