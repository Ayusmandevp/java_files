import java.util.*;
public class Loop9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter a number:");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num%10==0){
                continue;
            }
            System.out.println("num:"+num);
        }
    }
}