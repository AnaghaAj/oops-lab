import java.util.Scanner;
public class Student
{
public static void main(String[] args)
{
  Scanner x=new Scanner(System.in);
 String name;
 int rollno;
 char[] branch;
 double mark;
 char grade;
 System.out.print("Enter the name : ");
 name=x.nextLine();

 System.out.print("Enter the Roll no. : ");
 rollno=x.nextInt();

 System.out.print("Enter the Branch : ");
 branch=x.next().toCharArray();
 System.out.print("Enter the Total mark : ");
mark=x.nextDouble();
System.out.print("Enter the Grade : ");
grade=x.next().charAt(0);

System.out.println();
System.out.print(" Name : "+name+ "\n Roll no : "+rollno+" \n Branch : ");
for(int i=0;i<branch.length;i++)
   System.out.print(branch[i]);
System.out.print("\n Mark : "+mark+"\n Grade : "+grade);
}
}