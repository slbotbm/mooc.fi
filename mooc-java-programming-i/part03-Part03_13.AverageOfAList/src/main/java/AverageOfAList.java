
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num != -1) {
                list.add(num);
                sum += num;
            } else { 
                break;
            }
        }
        if (list.size() != 0) {
            System.out.println("Average: " + ((double) sum/list.size()));
        }
        
    }
}
