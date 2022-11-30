public class yum {
    public static void main(String[]args){
        String[] hamburger = {"Beef", "Cheese", "Lettuce", "Condiments", "Buns", "Tomato"};
        int[] add = {12, 13, 25, 38, 63, 101};
        double[] grades = {94.09, 95.15, 92.3, 101.5, 97.88, 95.52, 99.41};
        int i = 0;
        while(i < hamburger.length){
            System.out.println(hamburger[i]);
            i++;
        }
        for(int j = 0; j < add.length-1; j++){
            System.out.println(add[j]);
        }
        for(double x : grades){
            System.out.println(x);
        }
    }
}
