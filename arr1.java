import java.util.*;
public class arr1 {
    public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i]+=1;
            }
            System.out.println(Arrays.toString(marks));
    }
    public static void main(String args[]){
        
        int marks[]={92,89,95,100,93};
        update(marks);
        System.out.println(Arrays.toString(marks));
    }
}
