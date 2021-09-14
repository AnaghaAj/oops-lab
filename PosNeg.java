import java.util.Scanner;
public class PosNeg
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  System.out.print("Enter the number:  ");
  int a=x.nextInt();
  //String num=a>=0?("Positive"):("Negative");
  String num=a>0?"Positive":(a<0)?"Negative":"zero";
  System.out.println(a+" is a "+num+" number");
 }
}