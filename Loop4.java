import java.util.*;
public class Loop4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till which you want to print:");
        int n=sc.nextInt();
        int num=1;
        int sum=0;
        while (num<=n){
            sum+=num;
            num++;
        }
        System.out.println("Sum is "+sum);
    }
}