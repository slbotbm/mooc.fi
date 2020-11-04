
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String num = scanner.nextLine();
            if (num.equals("end")) {
                break;
            }
            System.out.println(Integer.valueOf(num)*Integer.valueOf(num)*Integer.valueOf(num));
        }

    }
}
