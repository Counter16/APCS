import java.util.Scanner;
import java.util.ArrayList;

class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(chickenNugget(sc.nextLine()));
    sc.close();
  }
  
  public static int chickenNugget(String chicken){
    ArrayList<String> elements = new ArrayList<String>();
    boolean intAdded = false;
    boolean symbolAdded = true;
    for (int i = 0; i < chicken.length(); i++) {
      if (Character.isDigit(chicken.charAt(i))) {
        symbolAdded = false;
        if (intAdded) {
          elements.set(elements.size() - 1, elements.get(elements.size() - 1) + chicken.substring(i, i + 1));
        }
        else {
          elements.add(chicken.substring(i, i + 1));
          intAdded = true;
        } 
      }
      else {
        intAdded = false;
        elements.add(chicken.substring(i, i + 1));
        if (symbolAdded && chicken.charAt(i) == '-') {
          intAdded = true;
        }
        else {
          symbolAdded = true;
        }
      }
    }
    if (elements.contains("(")) {
      int i1 = 0;
      int i2 = 0;
      for (int i = 0; i < elements.size(); i++) {
        if (elements.get(i).equals("(")) {
          i1 = i;
        }
        else if (elements.get(i).equals(")")) {
          i2 = i;
          break;
        }
      }
      elements.add(i1, String.valueOf(chickenNugget(String.join("", elements.subList(i1 + 1, i2)))));
      for (int i = 0; i < i2 - i1 + 1; i++) {
        elements.remove(i1+1);
      }
      return chickenNugget(String.join("",elements));
    }
    else if (elements.contains("^")) {
      int i = elements.indexOf("^");
      int x = (int) Math.pow(Integer.parseInt(elements.get(i - 1)), Integer.parseInt(elements.get(i + 1)));
      elements.add(i - 1, String.valueOf(x));
      elements.remove(i);
      elements.remove(i);
      elements.remove(i);
      return chickenNugget(String.join("",elements));
    }  
    else if (elements.contains("*") || elements.contains("/")) {
      int i;
      if (elements.indexOf("*") == -1) {
        i = elements.indexOf("/");
      }
      else if (elements.indexOf("/") == -1) {
        i = elements.indexOf("*");
      }
      else {
        i = Math.min(elements.indexOf("*"), elements.indexOf("/"));
      }
      int x;
      if (elements.get(i).equals("*")) {
        x = Integer.parseInt(elements.get(i - 1)) * Integer.parseInt(elements.get(i + 1));
      }
      else {
        x = Integer.parseInt(elements.get(i - 1)) / Integer.parseInt(elements.get(i + 1));
      }
      elements.add(i - 1, String.valueOf(x));
      elements.remove(i);
      elements.remove(i);
      elements.remove(i);
      return chickenNugget(String.join("",elements));
    }
    else if (elements.contains("+") || elements.contains("-")) {
      int i;
      if (elements.indexOf("+") == -1) {
        i = elements.indexOf("-");
      }
      else if (elements.indexOf("-") == -1) {
        i = elements.indexOf("+");
      }
      else {
        i = Math.min(elements.indexOf("+"), elements.indexOf("-"));
      }
      int x;
      if (elements.get(i).equals("+")) {
        x = Integer.parseInt(elements.get(i - 1)) + Integer.parseInt(elements.get(i + 1));
      }
      else {
        x = Integer.parseInt(elements.get(i - 1)) - Integer.parseInt(elements.get(i + 1));
      }
      elements.add(i - 1, String.valueOf(x));
      elements.remove(i);
      elements.remove(i);
      elements.remove(i);
      return chickenNugget(String.join("",elements));
    }
    else {
      return Integer.parseInt(elements.get(0));
    }
  }
}
