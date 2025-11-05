//Without input

/*public class Productoftwo{
    public static void main(String args[]){
        int a=5;
        int b=6;
        int prod=a*b;
        System.out.print(prod);
    }
}*/

//with input
import java.util.*;
public class Productoftwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=a*b;
        System.out.print(prod);
    }
}