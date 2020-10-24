package exercise3;

import java.util.Scanner;

public class Triangle {
  public static void main (String[] args) {
    double a;
    double b;
    double c;
    do{
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
      boolean correct= (a>0) && (b>0) && (c>0) && (a+b>c) && (b+c>a) && (a+c>b);
      if(correct){
        double s = (a + b + c) / 2;
  double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
       System.out.println("Area: " + area);
       if(a==b && b==c){
        System.out.println("Triangle is: equilateral");
      } else if (a==b || a == c || b == c) {
        System.out.println(" Triangle is: isosceles");
      } else{
         System.out.println("Triangle is scalene");
      }
    }
    else{ 
      System.out.println("Values are not correct!");
    }

  } while (a>0 && b>0 && c>0);
 }
}