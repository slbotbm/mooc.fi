
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File: ");
        String name = scan.nextLine();
        System.out.print("Team: ");
        String team = scan.nextLine();
        int counter = 0;
        int loss = 0;
        int win = 0;
        
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            while (scanner.hasNextLine()) {
                int teamS = 0;
                int otherS = 0;
                boolean checker= false;
                String[] row = scanner.nextLine().split(",");
                // System.out.println(row[0]+ " " + row[1]+ " " + row[2]+ " " + row[3]);
                if (row[0].equals(team)) {
                    
                    counter += 1;
                    teamS = Integer.valueOf(row[2]);
                    otherS = Integer.valueOf(row[3]);
                    // System.out.println("Entered with row[0], teamS: " + teamS +", otherS: " + otherS);
                    checker = true;
                } else if (row[1].equals(team)) {
                    counter += 1;
                    teamS = Integer.valueOf(row[3]);
                    otherS = Integer.valueOf(row[2]);
                    // System.out.println("Entered with row[0], teamS: " + teamS +", otherS: " + otherS);
                    checker = true;
                }
                if (checker == true) {
                    if (teamS > otherS) {
                    // System.out.println("Increasing wins");
                    win += 1;
                     } else {
                        loss += 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}
