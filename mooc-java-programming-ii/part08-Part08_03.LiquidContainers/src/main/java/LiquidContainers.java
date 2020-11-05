
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100\n" + "Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } // add
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // add
            if (command.equals("add")) {
                if (amount > 0) {
                    if ((first + amount) > 100) {
                        first = 100;
                    } else {
                        first += amount;
                    }
                }
            } 
            // move 
            else if (command.equals("move")) {
                if (amount > 0) {
                    if (amount > first) {
                        if ((first + second) > 100) {
                            second = 100;
                        } else {
                            second += first;
                        }
                        first = 0;
                    } else {
                        if ((second + amount ) > 100) {
                            second = 100;
                        } else {
                            second += amount;
                        }
                        first -= amount;
                    }
                    
                }
            } // remove
            else if (command.equals("remove")) {
                if (amount > 0) {
                    if ((second - amount) < 0) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }
            System.out.println("");
            

        }
    }

}
