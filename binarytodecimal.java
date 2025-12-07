import java.util.*;
public class binarytodecimal {
    static int  bintodec(int bin){
        int num=0;
        int pow=1;
        while (bin>0){
            int rem=bin%10;
            num+=rem*pow;
            pow*=2;
            bin/=10;
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the binary:");
        int bin=sc.nextInt();
        System.out.print(bintodec(bin));
    }
}
