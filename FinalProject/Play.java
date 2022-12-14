package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Play {
  // public String getLoadPhrase() throws FileNotFoundException {
  //   return loadPhrase();
  // }

  // private String loadPhrase() throws FileNotFoundException {
  //   String listOfOptions = "";
  //   try {

  //     Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/FinalProject/text.txt"));
  //     while (sc.hasNextLine()) {
  //       listOfOptions += sc.nextLine();
  //       listOfOptions += "\n";
  //     }
  //   } catch (Exception e) {
  //     System.out.println("Error reading or parsing list of countries/capitals");
  //   }
  //   System.out.println(listOfOptions);
  //   return listOfOptions;

  // }

  public void runGame(String playerOneName, String playerTwoName, int player1Score, int player2Score){
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
        player1Score--;
      }
      playerCalculator++;
      
    }
  }
}
