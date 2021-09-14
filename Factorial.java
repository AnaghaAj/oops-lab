import java.util.Scanner;
   public class Factorial {
      public static void main(String args[]){
         int i, fact=1, n;
         System.out.println("Enter the number:");
         Scanner s=new Scanner(System.in);
         n = s.nextInt();
         for(i = 1; i<=n; i++) {
            fact= fact* i;
         }
         System.out.println("Factorial of the given number is:"+fact);
      }
    } 