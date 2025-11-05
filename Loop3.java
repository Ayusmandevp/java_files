import java.util.*;
public class Loop3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till which you want to print:");
        int n=sc.nextInt();
        int count=1;
        while (count<=n){
            System.out.println(count);
            count++;
        }
    }
}