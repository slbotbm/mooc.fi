
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            }
            String[] answerBroken = answer.split(" ");
            for (String i : answerBroken) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }

    }
}
