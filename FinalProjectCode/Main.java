package FinalProjectCode;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {


        
        
        //ignore for activities, write necessary code above

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of player that will undergo the gamer test:"); // asks for how many people it
                                                                                        // should loop for
        int j = sc.nextInt();
        for (int k = 1; k < j + 1; k++) {
            System.out.println("Input height(in feet) of player " + k); // asks for the following 4 variables to
                                                                        // calculate their fortnite skill
            int a, b, c, d;
            a = sc.nextInt();
            System.out.println("Input showers taken(past year) by player " + k);
            b = sc.nextInt();
            System.out.println("Input hours spent outside(past year) by player " + k);
            c = sc.nextInt();
            System.out.println("Input grass strands touched(past month) by player " + k);
            d = sc.nextInt();
            Player universalPlayer = new Player((int) (Math.random() * 100 + 75), a, b, c, d, "", ""); // instantiate player object

            Formula yup = new Formula(universalPlayer.getFortniteSkill(), universalPlayer.getHeight(), //uses the getters from player class to equate all of the variables for use in the formula class
                    universalPlayer.getShowersTaken(), universalPlayer.getHoursOutside(),
                    universalPlayer.getGrassStrandsTouched(), universalPlayer.getGamingAbility(),
                    universalPlayer.getFortniteRank());
        }
        sc.close();
    }
}

}
