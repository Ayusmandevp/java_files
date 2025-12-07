import java.util.*;
public class Condition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your age:");
        int age=sc.nextInt();
        if (age>=18){
            System.out.print("You can vote");
        }else{
            System.out.print("You can't vote");
        }
        sc.close();
    }
}