import java.util.*;
public class Star4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int line=sc.nextInt();
        int ascii_value=65;
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)ascii_value);
                ascii_value++;
            }
            System.out.print("\n");
        }
    }
}