package mylesB;
/*
 * Myles Benson
 * APCS
 * 3/14
 * 
 */
//**
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**
import java.util.Scanner;
public class ComparePlayers
{
    public static void main(String[] args)
    {
        Player player1 = new Player(); //creates player 1
        Player player2 = new Player(); //creates player 2
        
        Scanner scan = new Scanner(System.in);
        
        //Prompt for and read in information for player 1
        System.out.println("First player's infomration : (name, team, jersey num)"); //print statement for the first player
        player1.readPlayer(); //scans the information for player 
        
        //Prompt for and read in information for player 2
        System.out.println("Second player's information : (name, team, jersey num)"); //print statement for the second player
        player2.readPlayer(); //scans the info for player 2
        
        //Compare player1 to player 2 and print a message saying
        if (player1.equals(player2)) {
            System.out.println("they're the same payer"); //prints if they are the same player
        }
        else {
            System.out.println("These are 2 different players"); //prints that they are different 
        }
        //whether they are equal
    }
}