import java.util.*;
public class maxSubArraySum {

    public static void maxSubArraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int start=i,end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=numbers[k];
                }
                System.out.println("Current sum= "+currentSum);
                if (maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum= "+maxSum);

    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        int num[]={1,-2,6,-1,3};
        maxSubArraySum(num);
    }
}