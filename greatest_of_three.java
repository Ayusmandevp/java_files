import java.util.Scanner;
public class greatest_of_three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number one:");
        int a=sc.nextInt();
        System.out.print("Enter number two:");
        int b=sc.nextInt();
        System.out.print("Enter number three:");
        int c=sc.nextInt();
        int greatest=(a>b&&a>c?a:(b>c)?b:c);
        System.out.println("Greatest is "+greatest);
    }
}
