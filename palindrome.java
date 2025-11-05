import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev=0,temp=num;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(rev==temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}
