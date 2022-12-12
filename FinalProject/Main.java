package FinalProject;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        System.out.println(
                "Hello. The game you will be playing will involve the usage of country and capital names. A random country will be outputted, and players will take turns naming countries/capitals that begin with the last letter of the most recent country/capital named. Every correct guess made results in an increase in player score, and the game ends when a player types 'surrender'.");
        Play run = new Play();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("\033[H\033[2J");
        System.out.println(
                "Soon, a list of all possible countries/capitals will appear. This will give you some examples of countries/capitals that are usable. A couple things to note: \n"
                        + "-Countries/Capitals that use hyphens have to be inputted as hyphens(Porto-Novo, Guinea-Bissau). \n"
                        + "-Spell correctly.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException f) {
            Thread.currentThread().interrupt();
            System.out.print("\033[H\033[2J");
        }
            run.getLoadPhrase();

        }
    }

