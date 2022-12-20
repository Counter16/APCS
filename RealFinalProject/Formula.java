package RealFinalProject;

public class Formula {
    public Formula(double fortniteSkill, int height, int showersTaken, int hoursOutside, int grassStrandsTouched, String gamingAbility, String fortniteRank){
        int j = (int)(Math.random() * 30 - 5);
    if (j <= showersTaken){ //showers taken can be fatal for a gamer's prowess. However, not taking showers is looked down upon in society, so it is a trade-off that a gamer sometimes is required to take. 
        fortniteSkill -= 10; //therefore, showers aren't as impactful as some of the later variables
    } 
    else if (j == showersTaken){ 
        fortniteSkill *= 1.01;
    }
    else {
        fortniteSkill *= 1.3;
    }
    while(height > 3){ //height means you probably got proper nutrients as a child, which is a big no-go for gamers. Your nutrients negatively impacted the effect of
        height--; // going goblin mode in fortnite battle royale or other games, so height negatively impacts your skill
        fortniteSkill -= 5;
    }
    for(int q = 0; q < hoursOutside; q++){ //hours outside is also very bad for your gaming skill. You need to hone your skills by playing games at least 16 hours a day, 
        fortniteSkill--; // and you can spend the last 8 hours watching anime or eating mcdonalds. Going outside takes away from that crucial and necessary time.
    }
    if (hoursOutside < 0){
        fortniteSkill += 20;
    }
    if(!(grassStrandsTouched <= 5)){ //naturally, it is common knowledge that gamers are allergic to grass. if you touch grass, you run the risk of having irritated hands
        System.out.println("I am proud of your effort sir.\n" + "Well done.\n"); // which can much decrease your level of gaming
        fortniteSkill *= 2;
    }
    if(fortniteSkill < 40){
        gamingAbility = "L player, uninstall noob";
        int o = (int) (Math.random() * 4 + 1);
        if(o == 1){
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
    if(fortniteSkill >= 40 && fortniteSkill <= 80){
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
    if(fortniteSkill >= 150){
        gamingAbility = "carry me you epic fortnite gamer";
        fortniteRank = "supersonic legend god radiant champ grandmaster top 500 global elite gamer";
        System.out.println("Honestly, " + gamingAbility + "! You are probably a " + fortniteRank + ". I commend you for your gamingness and I wish I can be you one day.");
    }
    System.out.println("Your fortnite gaming level is " + fortniteSkill);
    }
}