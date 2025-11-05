import java.util.*;
public class Pattern4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(num>10){
                    System.out.print(num);
                }else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.print("\n");
        }      
    }
}