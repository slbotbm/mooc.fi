
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            }
            String[] answerBroken = answer.split(",");
            if (oldest < Integer.valueOf(answerBroken[1])) {
                oldest = Integer.valueOf(answerBroken[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
