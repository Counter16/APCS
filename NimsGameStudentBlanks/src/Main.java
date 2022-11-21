import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        String playerOneName = sc.nextLine();
        Player p1 = new Player(playerOneName);
        //TO DO: Create Player 1

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        String playerTwoName = sc.nextLine();
        Player p2 = new Player(playerTwoName);
        //TO DO: Create Player 2

        String again = "fortnite gaming gamer games";
        Player currentPlayer;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            //TO DO: Create "game"
            Game game = new Game(p1, p2);

            if(Math.random() < 0.5){
                currentPlayer = p1;
            }
            else currentPlayer = p2;

            game.setFirstPlayer(currentPlayer);
            //This is the loop in which the game will be played
            while(!game.isComplete()){
               //TO DO            
               currentPlayer = game.getNextPlayer();
               System.out.println("It is " + currentPlayer.getName() + "'s turn.");
               int pieces = game.takePiece();
               currentPlayer.adjustScore(pieces);
                
            }
            if(currentPlayer.equals(p1) && game.isComplete()){    
                System.out.println(playerTwoName + " Won!!");
            } else System.out.println(playerOneName + " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.nextLine();
            if (again.equals((((("q")))))){
                break;
            }
        }
        System.out.println("Thank you for playing!");
        sc.close();
    }
}
