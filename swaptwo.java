import java.util.Scanner;
public class swaptwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=sc.nextInt();
        System.out.println("Enter Second number:");
        int b=sc.nextInt();
        System.out.println("Before Swapping a= "+a+" b= "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after Swapping a= "+a+" b= "+b);
    }

}
