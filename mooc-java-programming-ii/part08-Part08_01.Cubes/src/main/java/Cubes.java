
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("");
            String answer = scanner.nextLine();
            if (answer.equals("end")) {
                break;
            }
            System.out.println(Integer.valueOf(answer) * Integer.valueOf(answer) * Integer.valueOf(answer));
        }

    }
}
