package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    boolean isPrime = true;

    for(int i=2;i<=Math.sqrt(n); i++){
     if (n%i==0);
     boolean isPrime = false;
    }
    if (n%i==1){
      System.out.println("true");
    }
    
    
  }
}