
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.print("How many books to create? ");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name"));
        }
        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
        

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (searchedId == books.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int first = 0;
        int last = books.size()-1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (searchedId == books.get(middle).getId()) {
                return middle;
            } else if (searchedId > books.get(middle).getId()) {
                first = middle + 1;
            } else if (searchedId < books.get(middle).getId()) {
                last = middle - 1;
            }
        }
 
        
        return -1;
    }
}

