import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Board oihoih = new Board();
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
            oihoih.intro(playerOne.getName());
        while(oihoih.getJ() == 0){
            oihoih.runGame(playerOne.getName(),playerTwo.getName());
        }
        sc.close();
    }

}
