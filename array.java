import java.util.Scanner;
public class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            System.out.println("Arr[i]=");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        System.out.println(even+"      "+odd);
    }
}