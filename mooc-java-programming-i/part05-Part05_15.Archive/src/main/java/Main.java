
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Archive> items = new ArrayList<>();
        ArrayList<String> done = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
        
            if ( identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            Archive record = new Archive(identifier, name);
            items.add(record);
        }
        System.out.println();
        System.out.println("==Items==");
        for (Archive item : items) {
            if (!(done.contains(item.getIdentifier()))) {
                System.out.println(item);
                done.add(item.getIdentifier());
            }
        }
    }
}
