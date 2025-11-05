import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int isprime=1;
        for(int i=2;i<=n/2;i++){   //condition can be i<=Math.sqrt(n)
            if(n%i==0){
                isprime=0;
                break;
            }
        }
        if(isprime==1){
            System.out.print(n+" is a prime number");
        }else{
            System.out.print(n+" is not a prime number");
        }
    }
}