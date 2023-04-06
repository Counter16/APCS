import java.util.Scanner;
import java.util.ArrayList;

class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter your expression: ");
      try {
        System.out.println(evaluate(sc.nextLine()));
      }
      catch (Exception e) {
        System.out.println(e);
      }
    }
  }
  
  public static int evaluate(String expression){
    ArrayList<String> elements = new ArrayList<String>();
    boolean intAdded = false;
    boolean symbolAdded = true;
    for (int i = 0; i < expression.length(); i++) {
      if (Character.isDigit(expression.charAt(i))) {
        symbolAdded = false;
        if (intAdded) {
          elements.set(elements.size() - 1, elements.get(elements.size() - 1) + expression.substring(i, i + 1));
        }
        else {
          elements.add(expression.substring(i, i + 1));
          intAdded = true;
        } 
      }
      else {
        intAdded = false;
        elements.add(expression.substring(i, i + 1));
        if (symbolAdded && expression.charAt(i) == '-') {
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
      elements.add(i1, String.valueOf(evaluate(String.join("", elements.subList(i1 + 1, i2)))));
      for (int i = 0; i < i2 - i1 + 1; i++) {
        elements.remove(i1+1);
      }
      return evaluate(String.join("",elements));
    }
    else if (elements.contains("^")) {
      int i = elements.indexOf("^");
      int x = (int) Math.pow(Integer.parseInt(elements.get(i - 1)), Integer.parseInt(elements.get(i + 1)));
      elements.add(i - 1, String.valueOf(x));
      elements.remove(i);
      elements.remove(i);
      elements.remove(i);
      return evaluate(String.join("",elements));
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
      return evaluate(String.join("",elements));
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
      return evaluate(String.join("",elements));
    }
    else {
      return Integer.parseInt(elements.get(0));
    }
  }
}
