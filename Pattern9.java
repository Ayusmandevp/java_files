import java.util.*;
public class Pattern9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(" ".repeat(n-i)+"* ".repeat((i)));
        }
        for(int i=n;i>0;i--){
            System.out.println(" ".repeat((n-i))+"* ".repeat(i));
        }
    }
}