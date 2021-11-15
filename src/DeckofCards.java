import java.util.ArrayList;

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
    }
    /*
     * print() method to print combination of cards formed
     * */
    public void print(){
        System.out.println(deckofCards.toString());
    }
}



