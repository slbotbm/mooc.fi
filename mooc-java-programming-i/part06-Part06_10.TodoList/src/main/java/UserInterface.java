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
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList t, Scanner s) {
        this.list = t;
        this.scanner = s;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String answer = scanner.nextLine();
            if (answer.equals("stop")) {
                break;
            } else if (answer.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.list.add(task);
            } else if (answer.equals("list")) {
                this.list.print();
            } else if (answer.equals("remove")) {
                System.out.print("Which one is removed? " );
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(toRemove);
            }
        }
    }
    
}
