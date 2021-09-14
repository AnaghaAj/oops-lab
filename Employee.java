
import java.util.Scanner;
 
public class Employee {
 
 int eno;
 String ename;
 float esalary;
 
 public void Data() {
 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the eno : ");
  eno = sc.nextInt();
  System.out.print("Enter the ename : ");
  ename = sc.next();
  System.out.print("Enter the esalary : ");
  esalary = sc.nextFloat();
 }
 
 public void display() {
 
  System.out.println("Employee Number = " + eno);
  System.out.println("Employee name = " + ename);
  System.out.println("Employee salary = " + esalary);
 }
 
 public static void main(String[] args) {
int n,id;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Employees:");
 n=sc.nextInt();
  Employee e[] = new Employee[n];
 
  for(int i=0; i<n; i++) {
   
   e[i] = new Employee();
   e[i].Data();
  }
  System.out.println("enter the id to search");
  id=sc.nextInt();
  System.out.println("Employee information ::");
 
  for(int i=0; i<n; i++) {
   if(e[i].eno==id)
   {
   e[i].display();
   }
   else
   {
	   System.out.println("Id not found");
   }
  }
 }
}


