import java.util.*;
public class printallprime {
    static boolean prime(int num){
        if (num <= 1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false; 
            }
        }
        return true;
    }
    static void printprime(int num){
        for(int i=2;i<=num;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n till you want to print:");
        int num=sc.nextInt();
        System.out.println("Prime numbers are:");
        printprime(num);
        sc.close();
    }
}