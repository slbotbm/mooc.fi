
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(31, 12, 2001);
        SimpleDate date2 = new SimpleDate(28, 2, 2000);
        SimpleDate date3 = new SimpleDate(27, 2, 2001);
        SimpleDate date4 = new SimpleDate(30, 6, 2001);
        SimpleDate date5 = new SimpleDate(31, 5, 2001);
        SimpleDate date6 = new SimpleDate(15, 12, 2001);
        
        date1.advance();
        date2.advance();
        date3.advance();
        date4.advance();
        date5.advance();
        date6.advance();
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
    }
}
