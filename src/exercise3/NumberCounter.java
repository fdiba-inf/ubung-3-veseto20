package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double c;
    do {
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
    } while (a>0 && b>0 && c>0);
    System.out.println("Positive numbers:");
  } if (a<=0 && b<=0 && c<=0);
    System.out.println("Negative numbers:");
} double sum = a+b+c;
 System.out.println("Sum:" + sum);
 double average = (a+b+c)/3;
  System.out.println("Average:" + average);
    

  }
}