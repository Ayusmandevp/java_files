import java.util.*;
public class incomeTax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your income:");
        float income=sc.nextFloat();
        float tax;
        if (income<500000){
            tax=0;
        }else if(income>500000&&income<1000000){
            tax=income*0.2f;
        }else{
            tax=income*0.3f;
        }
        System.out.print("You have to pay tax of "+tax+" Rs.");
    }
}