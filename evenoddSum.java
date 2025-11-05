import java.util.*;
public class evenoddSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int evensum=0,oddsum=0;
        while(true){
            System.out.print("Ennter the number:");
            int num=sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }else{
                oddsum+=num;
            }
            System.out.print("Do you want to continue?press -1 for no and others for yes:");
            int choice=sc.nextInt();
            if(choice==-1){
                break;
            }
        }
        System.out.println("Sum of even numbers are "+evensum);
        System.out.println("Sum of odd numbers are "+oddsum);
    }
}