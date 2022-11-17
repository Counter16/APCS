import java.util.Scanner;
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

  private int j = 0;

  public int getJ() {
    return j;
  }
  public int getPlayerSelection(){
    return playerSelection;
  }

  private String lettersGuessed = ""; // holds all the letters guessed
  private int playerSelection = 1; // chooses which players turn it is based on if the other player guesses right or wrong
  public void intro(String playerOneName){
    System.out.println("READ CAREFULLY: Hello my dear friends. Today we will be playing Wheel of Fortune, but with a twist. Instead of each letter having a monetary value, the player who inputs the final guess will be the winner. However, if you don't guess a singular character(keep in mind, punctuation may be involved in the phrases.), you  will lose. With this in mind, lets begin!\n " + playerOneName + ", guess a letter."); // This adds a bit of variability and gives the second player a chance to win.
  }
  public void runGame(String playerOneName, String playerTwoName) {
    int counter = 0;
    String phraseGuesserThingy = "";
    String currentLetter = sc.nextLine();
    currentLetter = currentLetter.toLowerCase();
     
    if(currentLetter.length() > 1){
      lettersGuessed.concat("");
    }
    else if(currentLetter.equals(" ")){
      lettersGuessed.concat("");
    }
    else if(!lettersGuessed.contains(currentLetter)){
      lettersGuessed += currentLetter;
    } 
    
    // while(counter < phrase.length()){
    for (int i = 0; i < phrase.length(); i++) {
      String c = phrase.substring(i, i + 1);
      if (currentLetter.length() > 1) {
        System.out.println("Stop cheating dingus. You inputted multiple characters. Because of this mistake, you have lost, simpleton.");
        playerSelection = 1 + playerSelection;
        lettersGuessed.replace(currentLetter, "");
        i = phrase.length() - 1;
      } else if (currentLetter.equals(" ")) {
        System.out.println("You cannot input a space, dingus. Because of this mistake, you have lost, simpleton.");
        playerSelection = 1 + playerSelection;
        lettersGuessed.replace(currentLetter, "");
        i = phrase.length() - 1;
      }  else if (c.equals(" ")) {
          phraseGuesserThingy = phraseGuesserThingy.concat(" "); 
      } else if (lettersGuessed.contains(c)) {
        phraseGuesserThingy = phraseGuesserThingy.concat(c);
      } else {
        phraseGuesserThingy = phraseGuesserThingy.concat("_");        
      }
      if (currentLetter.contains(c)) {
        counter++;
      }
      
    }
    System.out.println(phraseGuesserThingy);
    System.out.println("Letters that have already been guessed: " + lettersGuessed);

    
    if (!phraseGuesserThingy.contains("_")){
      if(playerSelection % 2 == 1){
        System.out.println("Congratulations " + playerOneName + "! You win the game!");
        j = 1;
      }
      if(playerSelection % 2 == 0){
        System.out.println("Congratulations " + playerTwoName + "! You win the game!");
        j = 1;
      }
    }
    else if (counter > 0) {
      System.out.println("Good Job, you guessed right! Guess another letter!");
    }
    else if(playerSelection == 1 && counter == 0){
      System.out.println("You didn't guess a right letter. Now we switch players. Guess a letter, " + playerTwoName);
      playerSelection = 2;
    }
    else if(playerSelection == 2 && counter == 0){
      System.out.println("You didn't guess a right letter. Now we switch players. Guess a letter, " + playerOneName);
      playerSelection = 1;
    }
    // } else {
      
    //   System.out.printf("Now we switch players. Guess a letter %s:", playerSelection == 1 ? playerOneName : playerTwoName); // + playerTwo.getName);

    // }
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
    
    /*
     * get the end word
     * check for total mistakes == 7
     * get the char to guess
     * append the current word
     * print out the current word
     */

  
}
}