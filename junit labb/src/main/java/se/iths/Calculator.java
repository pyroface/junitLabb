package se.iths;

import java.util.Scanner;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) { return a * b; }

  public int divide(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {

    boolean run = true;
    Scanner myObj = new Scanner(System.in);
    int a, b;
    System.out.println("Skriv in de två siffrorna");
    a = myObj.nextInt();
    myObj.nextLine();

    b = myObj.nextInt();
    myObj.nextLine();

    System.out.println(
            "1: Addera\n" +
            "2: Subtrahera\n" +
            "3: Multiplicera\n" +
            "4: Dividera\n" +
            "0: Avsuta\n");

    while(run) {
      int userChoice = myObj.nextInt();
      myObj.nextLine();
      switch (userChoice) {
        case 0:
          run = false;
          break;
        case 1:
          System.out.println(a + " + " + b + " is " + new Calculator().add(a, b));
          System.out.println("----------------");
          break;
        case 2:
          System.out.println(a + " - " + b + " is " + new Calculator().sub(a, b));
          System.out.println("----------------");
          break;
        case 3:
          System.out.println(a + " * " + b + " is " + new Calculator().multiply(a, b));
          System.out.println("----------------");
          break;
        case 4:
          System.out.println(a + " / " + b + " is " + new Calculator().divide(a, b));
          System.out.println("----------------");
          break;
        default:
          System.out.println("Prova igen");
      }
    }

  }

}