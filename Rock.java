package Chapter3;
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        System.out.print ("Choose R, P, or S: ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt= generator.nextInt(3); 
        //Translate computer's randomly generated play to string
         if(computerInt==0){
            computerPlay="R";
        }
        else if(computerInt==1){
            computerPlay="P";
        }
        else {
            computerPlay="S";
        }
        
        //Print computer's play
        System.out.println("Computer Play" + computerPlay);
        if(personPlay.equals("R") && computerPlay.equals("S")){
            System.out.println("User Wins");
        }
        if(personPlay.equals("S") && computerPlay.equals("P")){
            System.out.println("User Wins");
        }
        if(personPlay.equals("P") && computerPlay.equals("R")){
            System.out.println("User Wins");
        }
        if(personPlay.equals("R") && computerPlay.equals("P")){
            System.out.println("Computer Wins");
        }
        if(personPlay.equals("S") && computerPlay.equals("R")){
            System.out.println("Computer Wins");
        }
        if(personPlay.equals("P") && computerPlay.equals("S")){
            System.out.println("Computer Wins");
        }
        if(personPlay.equals("R") && computerPlay.equals("R")){
            System.out.println("Tie");
        }
        if(personPlay.equals("S") && computerPlay.equals("S")){
            System.out.println("Tie");
        }
        if(personPlay.equals("P") && computerPlay.equals("P")){
            System.out.println("Tie");
        }
        //See who won.
    }
}