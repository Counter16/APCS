import java.util.Scanner;
public class Game {
    private int pieces;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Scanner sc = new Scanner(System.in);
    public Player getP1(){
        return p1;
    }
    public Player getP2(){
        return p2;
    }
    public Game(Player p1, Player p2){
        pieces = (int) (Math.random() * 41 + 10); //To Do: Grab a random value between 10 and 50
        this.p1 = p1;
        this.p2 = p2;
    }

    //Allows a player to take a specific amount of pieces.
    //Adds the amount of pieces taken to the user's score.
    public int takePiece(){
        
        System.out.println("There are "+ pieces+" pieces remaining!");
        System.out.println("Pick a number of pieces to take. It cannot be more than half of the remaining pieces.");
        int take = sc.nextInt();
        if(take <= pieces / 2){
        }
       // Grab the user amount of pieces and repeat if it not allowed.
        while (!isLegal(take)){
            System.out.println("You moron. Pick a number that works.");
            take = sc.nextInt();
        }
        // Adjust the pieces
        pieces = pieces - take;
        System.out.println("There are "+ pieces+" remaining!");
        System.out.println("-----------------------");
        return take;
    }

    public Player getNextPlayer(){
    //Changes which players turn it is and returns the current player.
        if(currentPlayer.equals(p1)){
            currentPlayer = p2;
        }
        else if(currentPlayer.equals(p2)){
            currentPlayer = p1;
        }
        return currentPlayer;
    }

    //Checks whether or not the user's requested move is allowed or not.
    public boolean isLegal(int x){
        if(pieces >= (x * 2) || x == 1){
            return true;
        }
        else return false;
    }


    //DO NOT CHANGE
    public boolean isComplete(){

        if (pieces == 0){ return true;}
        return false;
    }

    //DO NOT CHANGE
    public void setFirstPlayer(Player p){
        currentPlayer = p;
    }
}
