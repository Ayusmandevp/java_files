import java.util.*;
public class Largestoftwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=sc.nextInt();
        System.out.print("Enter num2:");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.print("Largest num is "+num1);
        }else if (num1<num2){
            System.out.print("Largest num is "+num2);
        }else{
            System.out.print("Both are same and Value of both is "+num2);
        }
    }
}