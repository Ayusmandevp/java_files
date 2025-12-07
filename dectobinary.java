import java.util.*;
public class dectobinary {
    static int  dectobin(int dec){
        int bin=0;
        int pow=1;
        while (dec>0){
            int digit=dec%2;
            bin=bin+digit*pow;
            dec/=2;
            pow*=10;
        }
        return bin;
    }


    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the num:");
        int num=sc.nextInt();
        System.out.print(dectobin(num));
        sc.close();
    }
}
