package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    

    for(int i=2;i<=Math.sqrt(n); i++) {
     if (n%i==0){
     boolean isPrime = false;
    } else { 
      System.out.println("true");
    }
    
    
  }
}
}
