/*
    Name: Svetlana Komarova
    Assignment:Deliverable
    Program: Computer Programmer
    Date: April 19, 2021

*/

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class simulates “War”, a two-person game that uses a deck of playing cards.
 *
 * @author Svetlana Komarova
 */
public class PlayGame {
    public static ArrayList <Player> players;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        players = new ArrayList<>();
        
        System.out.print("Enter a name for Player1:");
        String name1 = in.nextLine();
        System.out.print("Enter a name for Player2:");
        String name2 = in.nextLine();
        WarPlayer p1 = new WarPlayer(name1);
        WarPlayer p2 = new WarPlayer(name2);
        players.add(p1);
        players.add(p2);
           
        System.out.print("Enter a game name:");
        String name = in.nextLine();
        
        System.out.println("Play '" + name + "'!\n");
        
        WarGame myGame = new WarGame(name);
        myGame.setPlayers(players);
        
        myGame.play();
        
    }

}
