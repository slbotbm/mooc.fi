
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int longest = 0;
        String name = "";
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            }
            String[] answerBroken = answer.split(",");
            if (answerBroken[0].length() > longest) {
                longest = answerBroken[0].length(); 
                name = answerBroken[0];
            }
            sum += Integer.valueOf(answerBroken[1]);
            counter += 1;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double) sum/counter));

    }
}
