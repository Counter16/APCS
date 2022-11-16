import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println("What is player one's name?");
        Scanner sc = new Scanner(System.in);
        Player playerOne = new Player(sc.nextLine(), 0);
        //String name.playerOne() = sc.nextLine();
       
        System.out.println("What is player two's name?");
        Player playerTwo = new Player(sc.nextLine(), 0);
        System.out.print("\033[H\033[2J");
        System.out.println("Hello, " + playerOne.getName() + "!");
        try {
            Thread.sleep(500);  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Hello, " + playerTwo.getName() + "!");
        try {
            Thread.sleep(2500);  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }        
        System.out.println("\nInput a letter, " + playerOne.getName());

        Board oihoih = new Board();
        oihoih.runGame();
        oihoih.runGame();
        oihoih.runGame();
        oihoih.runGame();
        

        sc.close();
    }

}
