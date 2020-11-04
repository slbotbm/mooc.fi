
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getRooms() {
        return this.rooms;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPrice() {
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.getSquares() > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference (Apartment compared) {
        int diff = (this.getPrice() * this.getSquares()) - (compared.getPrice() * compared.getSquares());
        if (diff < 0) {
            diff *= -1;
        }
        return diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int diff = (this.getPrice() * this.getSquares()) - (compared.getPrice() * compared.getSquares());
        if (diff < 0) {
            return false;
        }
        return true;
    }
}
