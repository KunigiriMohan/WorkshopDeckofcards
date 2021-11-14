import java.util.Arrays;

public class Card {
    String suit;
    String rank;

    public Card(String  rank, String suit){             //Creating constructer of class Card and intialising variables
        this.suit=suit;
        this.rank=rank;
    }
    /*
    * overiding toString() method to print objects of constructer
    * */
    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
