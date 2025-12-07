import java.util.*;
public class reverseAnArray {

    public static void reverseArray(int numbers[]){
        int start=0,end=numbers.length-1;

        while (start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }

    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        System.out.println("Before reverse Array= "+Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("After reverse Array= "+Arrays.toString(numbers));
    }
}
