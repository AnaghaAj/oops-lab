import java.util.Scanner;
class Employee
{
 int empid;
 String name;
 float salary;
 String address;
 Employee()
 {
  empid=0;
  name="";
  salary=0;
  address="";
 }
 void input()
 {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the employee id : ");
  empid = in.nextInt();
  System.out.print("Enter the name : ");
  name = in.next();
  System.out.print("Enter the salary : ");
  salary = in.nextFloat();
  System.out.print("Enter the address : ");
  address = in.next();
 }
}
class Teacher extends Employee
{
 String dept,sub;
 Teacher()
 {
  dept="";
  sub="";
 }
 void data()
 {
  Scanner reader = new Scanner(System.in);
  System.out.print("Enter the Department : ");
  dept=reader.next();
  System.out.print("Enter the subject : ");
  sub=reader.next();
 }
 public void display()
 {
   System.out.println("Employee id = " + empid);
   System.out.println("Employee name = " + name);
   System.out.println("Employee salary = " + salary);
   System.out.println("Employee department = " + dept);
   System.out.println("Employee subject = " + sub);
 }
 public static void main(String[] args)
  {
   int n;
   Scanner reader=new Scanner(System.in);
   System.out.println("Enter the number of Employees:");
   n=reader.nextInt();
   Teacher t[] = new Teacher[n];
   for(int i=0; i<n; i++)
   {
    t[i] = new Teacher();
    t[i].input();
    t[i].data();
    System.out.println();
   }

   System.out.println("---Employee Details---");
   for(int i=0; i<n; i++)
   {
    t[i].display();
    System.out.println();
   }
 }
}
