package exercise3;



public class NumberSearch {
  public static void main (String[] args) {
  int numbercount=1;
  for (int i=100;i<1000;i++){
   if (i%5==0 && i%6==0){
     if(numbercount%10==0){
       System.out.println(i);
     } else{
       System.out.print(i + " ");
                }

                numbercount++;
   }
  }
  }
}