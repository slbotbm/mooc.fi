
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (!command.equals("quit")) {
                // add
                if (command.equals("add")) {
                    first.add(amount);
                
                } else if(command.equals("move")){
                    if (amount > 0) {
                        if (amount <= first.contains()) {
                            second.add(amount);
                            first.remove(amount);
                        } else if (amount > first.contains()) {
                            second.add(first.contains());
                            first.remove(1000);
                        }
                    }
                    
            } else if (command.equals("remove")){
                second.remove(amount);
            }
        } else {
                break;
            }
        }
    }
}
    


