package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Play {
  // public String getLoadPhrase() throws FileNotFoundException {
  // return loadPhrase();
  // }

  // private String loadPhrase() throws FileNotFoundException {
  // String listOfOptions = "";
  // try {

  // Scanner sc = new Scanner(new File(/* Replace with the path
  // */"/workspace/APCS/FinalProject/text.txt"));
  // while (sc.hasNextLine()) {
  // listOfOptions += sc.nextLine();
  // listOfOptions += "\n";
  // }
  // } catch (Exception e) {
  // System.out.println("Error reading or parsing list of countries/capitals");
  // }
  // System.out.println(listOfOptions);
  // return listOfOptions;

  // }

  public void runGame(String playerOneName, String playerTwoName, int player1Chances, int player2Chances, int player1Score, int player2Score){
      String listOfOptions = "";
        try {
    
          Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/FinalProject/text.txt"));
          while (sc.hasNextLine()) {
            listOfOptions += sc.nextLine();
            listOfOptions += "\n";
          }
        } catch (Exception e) {
          System.out.println("Error reading or parsing list of countries/capitals");
        }
      System.out.println(listOfOptions);
]      Scanner sc = new Scanner(System.in);
      int randomInt = (int) ((Math.random() * 378) + 1);
      String tempPhrase = "";
    try {
      int count = 0;
      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/FinalProject/text.txt"));
      while (sc.hasNextLine()) {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing list of countries/capitals");
    }
    System.out.println(tempPhrase);
    System.out.println("This will be the starting country/capital. From here, you will type a country/capital that ends with the last letter of the above word.");
    String tempy = sc.nextLine();
    String yum = "";
    int playerCalculator = 0;
    for(int i = 0; i < 500; i++){
      if(tempy.equals("surrender")){
        if(playerCalculator % 2 == 1){
          System.out.println("Congratulations " + playerOneName + ", you have bested " + playerTwoName + "!");
        }
        if(playerCalculator % 2 == 0){
          System.out.println("Congratulations " + playerTwoName + ", you have bested " + playerOneName + "!");
        }
        break;
      }
      else if(!listOfOptions.contains(tempy)){
        player1Chances--;
      }
      else if(listOfOptions.contains(tempy) && tempy.substring(0, 1).equals(tempPhrase.substring(tempPhrase.length()-1, tempPhrase.length()))){
        player1Score++;
      }
      else if(listOfOptions.contains(tempy) && tempy.substring(0, 1).equals(yum.substring(yum.length()-1, yum.length()))){
        player1Score++;
      }
      System.out.println(playerTwoName + ", it is now your turn to type a country/capital.");
      yum = sc.nextLine();
      if(yum.equals("surrender")){
        if(playerCalculator % 2 == 1){
          System.out.println("Congratulations " + playerTwoName + ", you have bested " + playerOneName + "!");
        }
        if(playerCalculator % 2 == 0){
          System.out.println("Congratulations " + playerOneName + ", you have bested " + playerTwoName + "!");
        }
        break;
      }
      else if(!listOfOptions.contains(yum)){
        player2Chances--;
      }
      else if(listOfOptions.contains(yum) && yum.substring(0, 1).equals(tempy.substring(tempy.length()-1, tempy.length()))){
        player2Score++;
      }
      System.out.println(playerTwoName + ", it is now your turn to type a country/capital.")
      playerCalculator++;
      playerCalculator++;

    }
  }
}
