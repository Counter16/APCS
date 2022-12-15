package FinalProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Play {
  public void runGame(String playerOneName, String playerTwoName, int player1Chances, int player2Chances,
      int player1Score, int player2Score) {
    String listOfOptions = "";
    String tempPhrase = "";
    int count = 0;
    int randomInt = (int) ((Math.random() * 300) + 1);
    try {
      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/FinalProject/text.txt"));
      while (sc.hasNextLine()) {
        listOfOptions += sc.nextLine();
        listOfOptions += "\n";
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing list of countries/capitals");
    }
    // System.out.println(listOfOptions);
    System.out.println(tempPhrase);
    System.out.println(
        "This will be the starting country/capital. From here, you will type a country/capital that ends with the last letter of the above word.");
    Scanner sc = new Scanner(System.in);
    String tempy = sc.nextLine();
    String yum = ".........";
    int playerCalculator = 0;
    if (tempy.equals("surrender")) {
      if (playerCalculator % 2 == 1) {
        System.out.println("Congratulations " + playerOneName + ", you have bested " + playerTwoName + "!");
      }
      if (playerCalculator % 2 == 0) {
        System.out.println("Congratulations " + playerTwoName + ", you have bested " + playerOneName + "!");
      }
    } else if (!listOfOptions.contains(tempy)) {
      player1Chances--;
    } else if (listOfOptions.contains(tempy)
        && tempy.substring(0, 1).equals(tempPhrase.substring(tempPhrase.length() - 1, tempPhrase.length()))) {
      player1Score++;
    } 
    for (int i = 0; i < 500; i++) {
      System.out.println(playerTwoName + ", it's now your turn.");
      tempy = sc.nextLine();
      playerCalculator++;
      if (tempy.equals("surrender")) {
        if (playerCalculator % 2 == 1) {
          System.out.println("Congratulations " + playerTwoName + ", you have bested " + playerOneName + "!");
        }
        if (playerCalculator % 2 == 0) {
          System.out.println("Congratulations " + playerOneName + ", you have bested " + playerTwoName + "!");
        }
        break;
      } else if (!listOfOptions.contains(tempy)) {
        player1Chances--;
      } else if (listOfOptions.contains(tempy)
          && tempy.substring(0, 1).equals(yum.substring(yum.length() - 2, yum.length() - 1))) {
        player1Score++;
      }
      System.out.println(playerOneName + ", it is now your turn to type a country/capital.");
      yum = sc.nextLine();
      playerCalculator++;
      if (yum.equals("surrender")) {
        if (playerCalculator % 2 == 1) {
          System.out.println("Congratulations " + playerOneName + ", you have bested " + playerTwoName + "!");
        }
        if (playerCalculator % 2 == 0) {
          System.out.println("Congratulations " + playerTwoName + ", you have bested " + playerOneName + "!");
        }
        break;
      } else if (!listOfOptions.contains(yum)) {
        player2Chances--;
      } else if (listOfOptions.contains(yum)
          && yum.substring(0, 1).equals(tempy.substring(tempy.length() - 1, tempy.length()))) {
        player2Score++;
      }
      playerCalculator++;
    
    }
    sc.close();
  }
}

