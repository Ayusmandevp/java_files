import java.util.*;
public class binomial_coefficient {
    static int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int num=sc.nextInt();
        System.out.print("Enter the r:");
        int r=sc.nextInt();
        System.out.print("binomial coefficient of "+num+" is "+factorial(num)/(factorial(r)*factorial(num-r)));
        sc.close();
    }
}