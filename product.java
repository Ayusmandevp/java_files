import java.util.Scanner;
public class product {
    static int multiply(int a,int b){
            return a*b;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product is "+multiply(a,b));
    }
}
