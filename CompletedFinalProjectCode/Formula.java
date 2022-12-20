package CompletedFinalProjectCode;

public class Formula {
    public Formula(double fortniteSkill, int height, int showersTaken, int hoursOutside, int grassStrandsTouched, String gamingAbility, String fortniteRank){
        int j = (int)(Math.random() * 30 - 5);
    if (j <= showersTaken){ //showers taken can be fatal for a gamer's prowess. However, not taking showers is looked down upon in society, so it is a trade-off that a gamer sometimes is required to take. 
        fortniteSkill -= 10; //therefore, showers aren't as impactful as some of the later variables
    } //this adds an element of luck and if they take more showers, their chance of decreasing fortnite skill increases
    else if (j == showersTaken){  //if showers taken equals random number, they get slight increase in fortnite skill because thats pretty lucky
        fortniteSkill *= 1.01;
    }
    else {
        fortniteSkill *= 1.3; //finally if showers taken is less than random number, fortnite skill goes up by 1.3x
    }
    while(height > 3){ //height means you probably got proper nutrients as a child, which is a big no-go for gamers. Your nutrients negatively impacted the effect of
        height--; // going goblin mode in fortnite battle royale or other games, so height negatively impacts your skill
        fortniteSkill -= 5; //for each number that  height is above 3, their fortnite skill decreases by 5
    }
    for(int q = 0; q < hoursOutside; q++){ //hours outside is also very bad for your gaming skill. therefore, your fortnite skill decreases by how many hours you spend outside
        fortniteSkill--; 
    }
    if (hoursOutside < 0){ //if you manage to spend a negative amount of hours outside, you get extra fortnite skill
        fortniteSkill += 20;
    }
    if(!(grassStrandsTouched <= 5)){ //naturally, it is common knowledge that gamers are allergic to grass. if you touch grass, you run the risk of having irritated hands
        System.out.println("I am proud of your effort sir.\n" + "Well done.\n"); //if you manage to not touch grass, you are heavily rewarded since it is hard to avoid(2x multiplier)
        fortniteSkill *= 2;
    }
    if(fortniteSkill < 40){ //now fortnite skill is used to find gaming ability and fortnite rank
        gamingAbility = "L player, uninstall noob";
        int o = (int) (Math.random() * 4 + 1);
        if(o == 1){ //to add some randomness in fortnite rank, i just made a simple if statement chain with random number. this is the same as the other categories
            fortniteRank = "bronze 4 jungler";
            System.out.println("Honestly, you are a " + gamingAbility + ". You are probably a " + fortniteRank + ". Do better.");
            }
        if(o == 2){
            fortniteRank = "bronze 2 jett main";
            System.out.println("Honestly, you are a " + gamingAbility + ". You are probably a " + fortniteRank + ". Do better.");
            }
        if(o == 3){
            fortniteRank = "silver 3 awp crutch";
            System.out.println("Honestly, you are a " + gamingAbility + ". You are probably a " + fortniteRank + ". Do better.");
            }
        if(o == 4){
            fortniteRank = "boosted gold 5 adc";
            System.out.println("Honestly, you are a " + gamingAbility + ". You are probably a " + fortniteRank + ". Do better.");
            }
    }
    if(fortniteSkill >= 40 && fortniteSkill <= 80){ //same as prior but different gmaing abilities and ranks, etc.
        gamingAbility = "not bad but I still smurf your peak";
        int w = (int) (Math.random() * 4 + 1);
        if(w == 1){
            fortniteRank = "gold nova 3";
            System.out.println("Honestly, you are " + gamingAbility + ". You are probably a " + fortniteRank + ". Not the worst.");
            }
        if(w == 2){
            fortniteRank = "plat 2 baiter";
            System.out.println("Honestly, you are " + gamingAbility + ". You are probably a " + fortniteRank + ". Not the worst.");
            }
        if(w == 3){
            fortniteRank = "boosted diamond 1 triples player";
            System.out.println("Honestly, you are " + gamingAbility + ". You are probably a " + fortniteRank + ". Not the worst.");
            }  
        if(w == 4){
            fortniteRank = "baiting master guardian 2 awper";
            System.out.println("Honestly, you are " + gamingAbility + ". You are probably a " + fortniteRank + ". Not the worst.");
            }  
    }
    if(fortniteSkill > 80 && fortniteSkill < 150){
        gamingAbility = "you aight";
        int x = (int) (Math.random() * 4 + 1);
        if(x == 1){
            fortniteRank = "ascendent 3";
            System.out.println("Honestly, " + gamingAbility + ". You are probably a " + fortniteRank + " gaming gamer.");
        }
        if(x == 2){
            fortniteRank = "champ in singles, you";
            System.out.println("Honestly, " + gamingAbility + ". You are probably a " + fortniteRank + " gaming gamer.");
        }
        if(x == 3){
            fortniteRank = "legendary eagle rifler";
            System.out.println("Honestly, " + gamingAbility + ". You are probably a " + fortniteRank + " gaming gamer.");
        }
        if(x == 4){
            fortniteRank = "nerdge master 3 nerdge ";
            System.out.println("Honestly, " + gamingAbility + ". You are probably a " + fortniteRank + " gaming gamer.");
        } 
    }
    if(fortniteSkill >= 150){ //you have to really be dedicated to get this which is why they are complimented so much
        gamingAbility = "carry me you epic fortnite gamer";
        fortniteRank = "supersonic legend god radiant champ grandmaster top 500 global elite gamer";
        System.out.println("Honestly, " + gamingAbility + "! You are probably a " + fortniteRank + ". I commend you for your gamingness and I wish I can be you one day.");
    }
    System.out.println("Your fortnite gaming level is " + fortniteSkill);
    }
}