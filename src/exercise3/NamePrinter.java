package exercise3;

import java.util.Scanner;

public class NumberPrinter {
  public static void main (String[] args) {
    Scannner input = new Scanner(Sytem.in);
    System.out.println("Enter your name: ");
    String name = input.next();
    for(int i=0; i<name.length();i++){
      char letter = name.charAt(i);
      System.out.println("*" + letter + "*");
    }
  }
}