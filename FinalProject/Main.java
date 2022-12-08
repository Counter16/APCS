package FinalProject;
import java.io.FileNotFoundException;
import java.security.SecureRandomParameters;
public class Main{
    public static void main(String args []) throws FileNotFoundException{
        System.out.println("Hello. The game you will be playing will involve the usage of country and capital names. A random country will be outputted, and players will take turns naming countries/capitals that begin with the last letter of the most recent country/capital named. Every correct made results in an increase in player score, and the game ends when a player types 'surrender'.");
        Play run = new Play();
        run.getLoadPhrase();
        try {
            Thread.sleep(5000);  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        System.out.print("\033[H\033[2J");

    }
}