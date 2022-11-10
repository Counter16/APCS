import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println("What is player one's name?");
        Scanner sc = new Scanner(System.in);
        Player playerOne = new Player(sc.nextLine(), 0);
        //String name.playerOne() = sc.nextLine();
       
        System.out.println("What is player two's name?");
        Player playerTwo = new Player(sc.nextLine(), 0);
        sc.close();
        System.out.println(playerOne.getName());
        System.out.println(playerTwo.getName());
        Board oihoih = new Board();
        oihoih.runGame();
    }

}
