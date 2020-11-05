
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int passing = 0;
        int pCounter = 0;
        int[] grades = {0, 0, 0, 0, 0, 0};
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int answer = Integer.valueOf(scanner.nextLine());
            if (answer == -1) {
                break;
            }
            if (answer > 0 && answer <=  100) {
                sum += answer;
                counter++;
                if (answer >= 50 ) {
                    passing += answer;
                    pCounter++;
                }
                if (answer < 50) {
                    grades[0]++;
                } else if (answer < 60) {
                    grades[1]++;
                } else if (answer < 70) {
                    grades[2]++;
                } else if (answer < 80) {
                    grades[3]++;
                } else if (answer < 90) {
                    grades[4]++;
                } else {
                    grades[5]++;
                }
            }
        }
        if (counter > 0) {
            System.out.println("Point average (all): " + 1.0 * sum / counter);
        } else {
            System.out.println("Point average (all): -");
        }
        if (pCounter > 0) {
            System.out.println("Point average (passing): " + 1.0 * passing / pCounter);
        } else {
            System.out.println("Point average (passing): -");
        }
        if (counter > 0) {
            System.out.println("Pass percentage: " + 100.0 * pCounter / counter);
        }
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            while (grades[i] != 0) {
                System.out.print("*");
                grades[i]--;
            }
            System.out.println("");
        }
        
    }
}
