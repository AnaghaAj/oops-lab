import java.util.Scanner;
class Person
{
 String name;
 String gender;
 String address;
 int age;
 Person()
 {
 name="";
 gender="";
 address="";
 age=0;
 }
 void pinput()
 {
 Scanner reader=new Scanner(System.in);
 System.out.print("Enter name : ");
 name=reader.next();
 System.out.print("Enter the gender: ");
 gender=reader.next();
 System.out.print("Enter the address : ");
 address=reader.next();
 System.out.print("Enter the age: ");
 age=reader.nextInt();
 }
}
class Employee extends Person
{
 int empid;
 String coname;
 String quali;
 float salary;
 Employee()
 {
 empid=0;
 coname="";
 quali="";
 salary=0;
 }
 void einput()
 {
 Scanner reader=new Scanner(System.in);
 System.out.print("Enter the employee id : ");
 empid=reader.nextInt();
 System.out.print("Enter the company name : ");
 coname=reader.next();
 System.out.print("Enter the qualification : ");
 quali=reader.next();
 System.out.print("Enter the salary : ");
 salary=reader.nextFloat();
 }
}
class Teachers extends Employee
{
String dept,sub;
int teachid;
Teachers()
{
 dept="";
 sub="";
 teachid=0;
}
void tinput()
{
 Scanner reader = new Scanner(System.in);
 System.out.print("Enter the Department : ");
 dept=reader.next();
 System.out.print("Enter the subject : ");
 sub=reader.next();
 System.out.print("Enter the teacher id : ");
 teachid=reader.nextInt();
}
void display()
{
System.out.println("Name : "+name);
System.out.println("Gender : "+gender);
System.out.println("Address : "+address);
System.out.println("Age : "+age);
System.out.println("Employee id : "+empid);
System.out.println("Company Name : "+coname);
System.out.println("Qualification : "+quali);
System.out.println("Salary : "+salary);
System.out.println("Subject : "+sub);
System.out.println("Department : "+dept);
System.out.println("Teacher id : "+teachid);
}
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("Enter the number of teachers : ");
int n=reader.nextInt();
Teachers t[]=new Teachers[n];
for(int i=0; i<n; i++)
{
 t[i] = new Teachers();
 t[i].pinput();
 System.out.println();
 t[i].einput();
 System.out.println();
 t[i].tinput();
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

