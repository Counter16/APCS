import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.io.File;

public class Board {
  private String phrase = loadPhrase();
  Scanner sc = new Scanner(System.in);

  private String loadPhrase() {
    String tempPhrase = "";

    int numOfLines = 0;
    tempPhrase = "how are you";

    try {

      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/phrases/phrases.txt"));
      while (sc.hasNextLine()) {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try {
      int count = 0;
      Scanner sc = new Scanner(new File(/* Replace with the path */"/workspace/APCS/phrases/phrases.txt"));
      while (sc.hasNextLine()) {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }
    return tempPhrase;
  }

  // public void askLetter(){
  // String letterGuessed = "";
  // System.out.println("Gimme number");
  // }
  public String getLoadPhrase() {
    return loadPhrase();
  }

  private int j = phrase.length();

  public int getJ() {
    return j;
  }

  private String lettersGuessed = "";

  public void runGame() {
    int counter = 0;
    String bombThreat = "";
    String currentLetter = sc.nextLine();
    currentLetter = currentLetter.toLowerCase();
    lettersGuessed += currentLetter;

    // while(counter < phrase.length()){
    for (int i = 0; i < phrase.length(); i++) {
      String c = phrase.substring(i, i + 1);
      if (c.equals(" ")) {
        bombThreat = bombThreat.concat(" ");
      } else if (currentLetter.length() > 1) {
        System.out.println("Stop cheating dingus.");
      } else if (currentLetter.equals(" ")) {
        System.out.println("You cannot input a space, dingus.");
        break;
      } else if (lettersGuessed.contains(c)) {
        bombThreat = bombThreat.concat(c);
      } else {
        bombThreat = bombThreat.concat("_");
      }
      if (currentLetter.contains(c)) {
        counter++;
        j--;
      }
      // }

    }
    System.out.println(bombThreat);
    System.out.println("Letters that have already been guessed: " + lettersGuessed);
    if (counter > 0) {
      System.out.println("Guess another letter!");

    } else {
      System.out.println("Now we switch players. Guess a letter:"); // + playerTwo.getName);
      
    }
    // for(int j = 0; j < phrase.length(); j++) {
    // String yes = new String(phrase);
    // int k = yes.indexOf(currentLetter);
    // String bombThreats = bombThreat;
    // for(int y = k; y >= 0; y++){
    // bombThreats = bombThreat.substring(0 , k+y) + currentLetter +
    // bombThreat.substring(k+y+1);
    // System.out.println(bombThreats);
    // yes = yes.replaceFirst(currentLetter, "");
    // k = yes.indexOf(currentLetter);
    // }
    // System.out.println(bombThreats);
    System.out.println(phrase);
    /*
     * get the end word
     * check for total mistakes == 7
     * get the char to guess
     * append the current word
     * print out the current word
     */

  }
}