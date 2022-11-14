import java.util.Scanner;
import java.io.File;
public class Board{
private String phrase = loadPhrase();
Scanner sc = new Scanner(System.in);
private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    
    try 
    {
      
      Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/APCS/phrases/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/APCS/phrases/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }
  public void askLetter(){
    String letterGuessed = "";
    System.out.println("Gimme number");
    
  }
  public String getLoadPhrase(){
    return loadPhrase();
  }
  public void runGame(){
    String currentLetter = "";
    String bombThreat = "";    
    for(int i = 0; i < phrase.length(); i++) {
      
      if(phrase.substring(i,i+1).equals(" ")){
        bombThreat = bombThreat.concat(" ");
      }
      else bombThreat = bombThreat.concat("_");
    }
    System.out.println(bombThreat);
    System.out.println("\nGIVE LETTER OR MAIL PIPEBOMB!");
      currentLetter = sc.nextLine();
    //for(int j = 0; j < phrase.length(); j++) {
      String yes = new String(phrase);
      int k = yes.indexOf(currentLetter);;
      String bombThreats = bombThreat;
      for(int y = k; y >= 0; y++){
        bombThreats = bombThreat.substring(0 , k+y) + currentLetter + bombThreat.substring(k+y+1);
        System.out.println(bombThreats);
        yes = yes.replaceFirst(currentLetter, "");
        k = yes.indexOf(currentLetter);
      }  
      System.out.println(bombThreats);
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
