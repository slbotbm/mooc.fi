
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;
    private ArrayList<Integer> scores;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
        this.scores = new ArrayList<>();
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }
            this.scores.add(points);
            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        int counter = 0;
        int sum = 0;
        for (int point : scores) {
            sum += point;
            counter++;
        }
        System.out.println("The average of points: " + (1.0 * sum / counter));
        counter = 0;
        sum = 0;
        for (int i = 5; i >= 0; i--) {
            sum += (i * this.register.numberOfGrades(i));
            counter += this.register.numberOfGrades(i);
        }
        
        System.out.println("The average of grades: " + (1.0 * sum / counter));
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
