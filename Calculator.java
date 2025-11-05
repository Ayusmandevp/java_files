import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter operator +,-,*,/,% for addition,Substraction,multiplication,division and modulo respectively:");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.print("a+b="+(a+b));
                break;
            case '-':
                System.out.print("a-b="+(a-b));
                break;
            case '*':
                System.out.print("a*b="+(a*b));
                break;
            case '/':
                System.out.print("a/b="+(a/b));
                break;
            case '%':
                System.out.print("a%b="+(a%b));
                break;
            default:
                System.out.print("Enter correct operator(+,-,*,/,%)...");
        }
    }
}