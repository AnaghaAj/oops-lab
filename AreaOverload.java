import java.util.Scanner;
import java.lang.Math;
class ShapeArea
{
 void area(int a)
 {
 int z=a*a;
  System.out.println("Area of square : "+z);
}
void area(float a,float b)
{
 System.out.println("Area of Rectangle : "+(a*b));
}
void area(double a)
{
 double z=3.14*a*a;
 System.out.println("Area of Circle : "+z);
}
}
class AreaOverload
{
public static void main(String args[])
{
 Scanner reader=new Scanner(System.in);
 ShapeArea obj=new ShapeArea();
 System.out.print("Enter the side of Square : ");
 int s=reader.nextInt();
 System.out.print("Enter the length of Rectangle : ");
 float l=reader.nextFloat();
 System.out.print("Enter the breadth of Rectangle : ");
 float b=reader.nextFloat();
 System.out.print("Enter the radius of circle : ");
 double r=reader.nextDouble();
 obj.area(s);
 obj.area(l,b);
 obj.area(r);
}
}


