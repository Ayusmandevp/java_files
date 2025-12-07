// import java.util.*;
// public class bubblesorting {
//     public static void bubblesort(int arr[]){
//         for(int turn=0;turn<arr.length-1;turn++){
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("Array is: "+Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         bubblesort(arr);
//     }
// }





// import java.util.*;
// public class bubblesorting {
//     public static void bubblesort(int arr[]){
//         int swap=0;
//         for(int turn=0;turn<arr.length-1;turn++){
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swap++;
//                 }
//             }
//             if(swap==0){
//                 System.out.println("Alraedy sorted: "+Arrays.toString(arr));
//                 return;
//             }
//         }
//         System.out.println("Array is: "+Arrays.toString(arr));
//     }
//     public static void main(String[] args) {
//         int arr[]={5,6,4,1,3,2};
//         int arr2[]={1,2,3,4,5};
//         int arr3[]={5,4,3,2,1};
//         bubblesort(arr);
//         bubblesort(arr2);
//         bubblesort(arr3);
//     }
// }



import java.util.*;
public class bubblesorting {
    public static void bubblesort(int arr[]){
        int allswap=0;
        for(int turn=0;turn<arr.length-1;turn++){
            int turnswap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    allswap++;
                    turnswap++;
                }
            }
            if(allswap==0){
                System.out.println("Already sorted: "+Arrays.toString(arr));
                return;
            }
            if(turnswap==0){
                System.out.println("Early sorted: "+Arrays.toString(arr));
                return;
            }
        }
        System.out.println("Array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,6,4,1,3,2};
        int arr2[]={1,2,3,4,5};
        int arr3[]={5,4,3,2,1};
        bubblesort(arr);
        bubblesort(arr2);
        bubblesort(arr3);
    }
}