
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            } else {
                String[] answerBroken = answer.split(" ");
                for (String i : answerBroken) {
                    System.out.println(i);
                }
            }
        }

    }
}
