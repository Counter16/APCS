package FinalProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Play {
    public String getLoadPhrase() throws FileNotFoundException{
      return loadPhrase();
    }
    private String loadPhrase() throws FileNotFoundException {
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
        return listOfOptions;
        
    }
    public void runGame(String playerOneName, String playerTwoName){
    
    }
}
