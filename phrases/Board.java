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
    String currentWord = phrase;
    for(int i = 0; i < phrase.length(); i++) {
      
      if(phrase.substring(i,i+1).equals(" ")){
        System.out.print(" ");
      }
      else System.out.print("_");
    }

    /* 
     * get the end word
     * check for total mistakes == 7
     * get the char to guess
     * append the current word
     * print out the current word
     */
    
  }
}
