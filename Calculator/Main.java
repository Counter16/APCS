import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args []){
        
    }
    public static String chickenNugget(String x){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your equation that needs to be solved? (Type without any spaces or you're a loser)");
        String chicken = sc.nextLine();
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(chicken.split()));
        String[] fart = chicken.split("");
        for (int i = 0; i < array.size(); i++){
            if(fart[i].equals(" ")){
              System.out.println("You are a loser.");
              array.remove(i);
            }
        }
        for(int j = array.size(); j > 0; j--){
          if(array.get(j).equals("(")){
            for(int k = j; k < array.size(); k++){
                if(array.get(j).equals(")"));
            }
          }
          if(!array.get(j).equals("(")){
            solve();
          }

          }
    }
    public static solve(String x){

    }
    }
}
