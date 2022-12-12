package FinalProject;
public class Player {
    private String name;
    private int score;
    private int chancesLeft;

    public Player(String name, int score, int chancesLeft){
        this.name = name;
        this.score = score;
        this.chancesLeft = chancesLeft;

    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public int getChancesLeft(){
        return chancesLeft;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setChancesLeft(int chancesLeft){
        this.chancesLeft = chancesLeft;
    }
}

