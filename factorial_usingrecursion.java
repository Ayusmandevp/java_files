import java.util.*;
public class factorial_usingrecursion {
    static int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("factorial of "+num+" is "+factorial(num));
        sc.close();
    }
}