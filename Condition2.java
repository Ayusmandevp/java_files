import java.util.*;
public class Condition2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your age:");
        int age=sc.nextInt();
        String val=age>=18?"adult":"not adult";
        System.out.print(val);
    }
}