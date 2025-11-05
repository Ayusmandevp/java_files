import java.util.*;
public class GST{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Pencil cost:");
        float price1=sc.nextFloat();
        System.out.print("Enter Pen cost:");
        float price2=sc.nextFloat();
        System.out.print("Enter eraser cost:");
        float price3=sc.nextFloat();
        float bill=price1+price2+price3+(price1+price2+price3)*0.18f;
        System.out.print(bill);
    }
}