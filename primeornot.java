import java.util.*;
public class primeornot {
    static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false; 
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int num=sc.nextInt();
        if(prime(num)==true){
            System.out.println("Prime");
        }else{
            System.out.println("not a prime");
        }
        sc.close();
    }
}