
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0) {
                counter += 1;
                sum += num;
            } else {
                continue;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sum/counter);
        }
    }
}
