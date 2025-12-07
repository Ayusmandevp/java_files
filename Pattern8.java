import java.util.*;
public class Pattern8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(" ".repeat(i));
            if(i==1 || i==n){
                System.out.println("*".repeat(n));
            }else{
                System.out.println("*"+" ".repeat(n-2)+"*");
            }
        }
    }
}