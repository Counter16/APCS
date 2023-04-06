import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      System.out.println("What is your equation that needs to be solved? (Type without any spaces or you're a loser)");
      String chicken = sc.nextLine();
      chickenNugget(chicken);
    }
    public static String chickenNugget(String chicken){
        ArrayList<String> array = new ArrayList<String>();
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
      while(x.contains("^")){
        int i = x.indexOf("^"); 
        while((i - 2) >= 0 && x.charAt(i-2) == '(' && x.charAt(i+2) == ')'){
           
        }
      }
    }
    }
