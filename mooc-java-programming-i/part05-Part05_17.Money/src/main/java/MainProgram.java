
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(1, 0);
        Money b = new Money(-3, 5);
        Money c = new Money(5, 0);

        System.out.println("1.0 < -3.5: " + a.lessThan(b));  // false
    }
}
