import java.util.*;
public class Loop7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=10899;
        // while (num>0){                       //Using while loop                                
        //     int digit=num%10;
        //     sum=sum*10+digit;
        //     num/=10;
        // }
        // System.out.print("New number is "+sum);
        for(;num>0;num/=10){                    //using for loop
            int digit=num%10;
            sum=sum*10+digit;
        }
        System.out.print("New number is "+sum);
    }
}