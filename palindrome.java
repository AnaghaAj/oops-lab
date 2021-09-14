
import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
        int a=num%10;
        rev=rev*10+a;
        num=num/10;
        }
        System.out.println("Reversed number is "+rev);
        if(temp==rev)
            System.out.println("The number "+temp+"  is palindrome");
        else
            System.out.println("The number "+temp+"  is not a palindrome");
    }
}