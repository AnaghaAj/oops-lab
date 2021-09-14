import java.io.*;

public class OddEvenFile
{
	public static void main(String args[])throws IOException,FileNotFoundException
	{
		int i;
		File f1=new File("c:\\javaprograms\\java\\OddEven.txt");
		File f2=new File("c:\\javaprograms\\java\\Even.txt");
		File f3=new File("c:\\javaprograms\\java\\Odd.txt");
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream op1=new FileOutputStream(f2);
		FileOutputStream op2=new FileOutputStream(f3);
		do 
		{
			i=in.read();
			if(i%2==0)
			op1.write(i);
			else
			op2.write(i);
        }
        while(i!=-1);
        in.close();
	      op1.close();
	      op2.close();
System.out.println("Oddevenfile is successfully completed:");
	}
}