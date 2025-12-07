import java.util.*;
public class largestinarray {
    public static void main(String args[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int marks[]={92,89,95,100,93};
        for(int i=0;i<marks.length;i++){
            if(largest<marks[i]){
                largest=marks[i];
            }
            if(smallest>marks[i]){
                smallest=marks[i];
            }
        }
        System.out.println("Largest is "+largest);
        System.out.print("Smallest is "+smallest);
    }
}
