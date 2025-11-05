import java.util.*;
public class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for both row and column:");
        int rc=sc.nextInt();
        for(int i=1;i<=rc;i++){
            for(int j=1;j<=rc;j++){
                if((i!=1&&i!=rc)&&(j!=1&&j!=rc)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n"); 
        }
    }
}