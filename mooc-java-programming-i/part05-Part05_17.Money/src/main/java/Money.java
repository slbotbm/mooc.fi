
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus (Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Money)) {
            return false;
        }
        
        Money comparedMoney = (Money) compared;
        
        if (this.euros < comparedMoney.euros) {
            return true;
        }else if (this.euros == comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus (Money decreaser) {
        int finalEuros = 0;
        int finalCents = 0;
        double myAmount = this.euros() + (0.01 * this.cents());
        double comparedAmount = decreaser.euros() + (0.01 * decreaser.cents());
        System.out.println("Amount: " + myAmount + ", " + comparedAmount);
        
        if (myAmount > comparedAmount) {
            if (this.cents() < decreaser.cents()) {
                finalEuros = this.euros() - (decreaser.euros() + 1);
                finalCents = 100 + (this.cents() - decreaser.cents());
            } else {
                finalEuros = this.euros() - decreaser.euros();
                finalCents = this.cents() - decreaser.cents();
            }
        }
        Money newMoney = new Money(finalEuros, finalCents);
        return newMoney;
    }

}
