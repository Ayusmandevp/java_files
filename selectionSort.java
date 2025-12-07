import java.util.*;
public class selectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){                                 //for decreasing it will be <
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
    }
}


