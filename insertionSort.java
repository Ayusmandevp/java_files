import java.util.*;
public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
        System.out.println("Array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
    }
}


