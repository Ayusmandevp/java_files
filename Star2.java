import java.util.*;
public class Star2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int line=sc.nextInt();
        for(int i=line;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}