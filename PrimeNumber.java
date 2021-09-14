import java.util.Scanner;
public class PrimeNumber
{
public static void main(String args[])
{
  int i,j;
 Scanner x=new Scanner (System.in);
System.out.print("Enter the number:");
int num=x.nextInt();
System.out.println("Prime Numbers upto "+num);
for(i=2;i<=num;i++)
{
 int count=0;
 for(j=1;j<=i;j++)
 {
  if(i%j==0)
    count=count+1;
 }
 if(count==2)
   System.out.print(" "+i);
 }
 }
}