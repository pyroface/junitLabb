package se.iths;

import java.util.Scanner;

public class TextProcessor {

  public static String lowerCase(String a) {
    return a.toLowerCase();
  }

  public static String upperCase(String a) {
    return a.toUpperCase();
  }

  public static String reverseText(String a){
    StringBuilder str = new StringBuilder(a);
    StringBuilder reverseStr = str.reverse();
    String x = reverseStr.toString();
    return x;
  }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Skriv in text");

    String a = myObj.nextLine();

    System.out.println(
            "1: Lower case\n" +
            "2: Upper case\n" +
            "3: Reverse\n");
    int userChoice = myObj.nextInt();
    myObj.nextLine();

    switch (userChoice) {
      case 1:
        System.out.println(lowerCase(a));
        break;
      case 2:
        System.out.println(upperCase(a));
        break;
      case 3:
        System.out.println(reverseText(a));
        break;
      default:
        System.out.println("prova igen");
        break;
    }

  }

}
