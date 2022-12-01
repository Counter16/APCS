public class practice {
    public static void main(String[]args){
        String[] arr = {"fading", "trailing", "battling", "chicken", "jingle"};
        for(String s : arr){   
            if(s.substring(s.length()-3, s.length()).equals("ing")){      
                System.out.println(s);   
            }
        }
    }
}
