package RealFinalProject;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of player that will undergo the gamer test:");
        int j = sc.nextInt();
        for(int k = 1; k < j+1; k++){
            System.out.println("Input height(in feet) of player " + k);
            int a, b, c, d;
            a = sc.nextInt();
            System.out.println("Input showers taken(past year) by player " + k);
            b = sc.nextInt();
            System.out.println("Input hours spent outside(past year) by player " + k);
            c = sc.nextInt();
            System.out.println("Input grass strands touched(past month) by player " + k);
            d = sc.nextInt();
            Player dooDooFard = new Player((int) (Math.random() * 100 + 75), a, b, c, d, "", "");
            Formula yup = new Formula( dooDooFard.getFortniteSkill(), dooDooFard.getHeight(), dooDooFard.getShowersTaken(), dooDooFard.getHoursOutside(), dooDooFard.getGrassStrandsTouched(), "", "");
            System.out.println("Input height, showers taken, hours outside, and grass strands touched by player 2(separate each with enter.)");
            }
            sc.close();
    }
}
