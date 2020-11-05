
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("\nFirst: " + first.toString() + "\nSecond: " + second.toString());
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
                first.add(amount);
            } 
            // move 
            else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    second.add(amount);
                    first.remove(amount);
                }
            } // remove
            else if (command.equals("remove")) {
                if (amount > 0) {
                    second.remove(amount);
            }
            System.out.println("");
        }
    }

}
}
