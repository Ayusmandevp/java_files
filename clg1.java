//print natural numbers 1 to 30
import java.util.Scanner;
public class clg1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter last number:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}