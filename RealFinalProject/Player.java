package RealFinalProject;

public class Player {
    private int fortniteSkill;
    private int height;
    private int showersTaken;
    private int hoursOutside;
    private int grassStrandsTouched;
    private String gamingAbility;
    private String fortniteRank;

    public Player(int fortniteSkill, int height, int showersTaken, int hoursOutside, int grassStrandsTouched, String gamingAbility, String fortniteRank){
        this.fortniteSkill = fortniteSkill;
        this.height = height;
        this.showersTaken = showersTaken;
        this.hoursOutside = hoursOutside;
        this.grassStrandsTouched = grassStrandsTouched;
        this.gamingAbility = gamingAbility;
        this.fortniteRank = fortniteRank;
    }
    public int getFortniteSkill(){ //setters/accessors
        return fortniteSkill;
    }
    public int getHeight(){
        return height;
    }
    public int getShowersTaken(){
        return showersTaken;
    }
    public int getHoursOutside(){
        return hoursOutside;
    }
    public int getGrassStrandsTouched(){
        return grassStrandsTouched;
    }
    public String getGamingAbility(){
        return gamingAbility;
    }
    public String getFortniteRank(){
        return fortniteRank;
    }
    public void setFortniteSkill(int fortniteSkill){ //modifiers/setters
        this.fortniteSkill = fortniteSkill;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setShowersTaken(int showersTaken){
        this.showersTaken = showersTaken;
    }
    public void setHoursOutside(int hoursOutside){
        this.hoursOutside = hoursOutside;
    }
    public void setGrassStrandsTouched(int grassStrandsTouched){
        this.grassStrandsTouched = grassStrandsTouched;
    }
    public void setGamingAbility(String gamingAbility){
        this.gamingAbility = gamingAbility;
    }
    public void setFortniteRank(String fortniteRank){
        this.fortniteRank = fortniteRank;
    }
}
