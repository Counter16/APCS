import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your equation that needs to be solved?");
        String chicken = sc.nextLine();
        String[] array = chicken.split(" ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
