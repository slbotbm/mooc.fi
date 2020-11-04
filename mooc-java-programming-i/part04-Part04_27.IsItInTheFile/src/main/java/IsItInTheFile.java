
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean counter = false;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while(scan.hasNextLine()) {
                if (scan.nextLine().equals(searchedFor)) {
                    counter = true;
                    System.out.println("Found!");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (counter == false) {
            System.out.println("Not found.");
        }

    }
}
