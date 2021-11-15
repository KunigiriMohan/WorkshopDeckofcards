import java.util.ArrayList;
import java.util.Scanner;

public class Players {

    ArrayList<String> persons= new ArrayList<String>();
    public void inputPlayer(){
        //Creating arrayList of persons
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many player play the Game");
        int i =scanner.nextInt();                       //Taking input from user how many players play the Game

        if (i>=2&& i<=4)                            //Checking input condition
        {
            for (int k=1;k<=i;k++){
                System.out.println("Enter player name: ");
                String name= scanner.next();
                persons.add(name);
            }
        }
    }
    /*
    * playerSequence() method to create sequence of player to play the game
    * */
    public void playerSequence() {
        for (int k=0;k<= persons.size()-1;k++)
        {
            System.out.println(persons.get(k)+" will play "+ (k+1) +" time ");
        }
    }
}
