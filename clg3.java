// GCD of two numbers

import java.util.Scanner;

/*public class clg3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number one:");
        int n1=sc.nextInt();
        System.out.print("Enter the number two:");
        int n2=sc.nextInt();
        int small=n1<n2?n1:n2;
        for(int i=small;i>=1;i--){
            if (n1%i==0 && n2%i==0){
                System.out.println("Greatest common diviser is "+i);
                break;
            }
        }
        sc.close();
    }
}*/



public class clg3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number one:");
        int a=sc.nextInt();
        System.out.print("Enter the number two:");
        int b=sc.nextInt();
        int r;
        while (b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("Greatest common diviser is "+a);
        sc.close();
    }
}