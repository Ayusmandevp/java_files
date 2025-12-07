


//Greatest of three numbers
import java.util.Scanner;
public class clg4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number one:");
        int a=sc.nextInt();
        System.out.print("Enter the number two:");
        int b=sc.nextInt();
        System.out.print("Enter the number three:");
        int c=sc.nextInt();
        int greatest=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(greatest);
        sc.close();
    }
}