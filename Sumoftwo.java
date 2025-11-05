//Without input

/*public class Sumoftwo{
    public static void main(String args[]){
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.print(sum);
    }
}*/

//with input
import java.util.*;
public class Sumoftwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print(sum);
    }
}