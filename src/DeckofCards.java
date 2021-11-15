import java.util.ArrayList;
import java.util.Random;

public class DeckofCards {
    ArrayList<Card> deckofCards = new ArrayList<Card>();            //Creating arraylist for deck of cards of type Card
    public static void main(String[] args){
        String [] suit = {"club","diamond","heart","Spade"};                    //Storing cards containing in suit in suit array
        String [] rank = {"1","2","3","4","5","6","7","8","9","Jack","King","Queen","Ace"}; //Storing card contains in rank arraay
        DeckofCards obj= new DeckofCards();
        Players obj1= new Players();
        
        for(int k=0;k<= suit.length-1;k++)                  //making combination of rank and suit cards
        {
            for(int i=0;i<= rank.length-1;i++)
            {
                Card oneCard=new Card(rank[i],suit[k]);
                obj.deckofCards.add( oneCard);
            }
        }
        obj.print();
        obj1.inputPlayer();
        obj1.playerSequence();
        obj.shuffle();
    }
    /*
     * print() method to print combination of cards formed
     * */
    public void print(){
        System.out.println(deckofCards.toString());
    }
    /*
    * shuffle() method to shuffle cards before distributing to players
    * */
    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < deckofCards.size(); i++) {
            int j = random.nextInt(deckofCards.size() - 1);
            Card card1 = deckofCards.get(i);
            Card card2 = deckofCards.get(j);
            deckofCards.set(i, card2);
            deckofCards.set(j, card1);
        }
    }
}



