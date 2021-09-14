import java.util.Scanner;
class Addition
{
 void add(int a,int b)
 {
 System.out.println("sum of 2 integers values "+a+" + "+b+" = "+(a+b));
 }
 void add(int a,int b,int c)
 {
  System.out.println("sum of 3 integers values "+a+" + "+b+" + "+c+" = "+(a+b+c));
 }
 void add(float a,float b)
 {
  System.out.println("sum of 2 float values "+a+" + "+b+" = "+(a+b));
 }
}
public class AddOverload
{
public static void main(String args[])
{
 Scanner reader=new Scanner(System.in);
 Addition obj=new Addition();
 System.out.println("Enter 2 integers values : ");
 int a=reader.nextInt();
 int b=reader.nextInt();
 System.out.println("Enter 3 integers values : ");
 int c=reader.nextInt();
 int d=reader.nextInt();
 int e=reader.nextInt();
 System.out.println("Enter 2 float values : ");
 float f=reader.nextFloat();
 float i=reader.nextFloat();
 obj.add(a,b);
 obj.add(c,d,e);
 obj.add(f,i);

}
}



