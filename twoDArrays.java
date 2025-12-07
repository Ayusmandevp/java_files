import java.util.*;
public class twoDArrays {
    public static void input(int array[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter matrix ["+i+"]["+j+"]:");
                array[i][j]=sc.nextInt();
            }
        }
    }
    public static void print(int array[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void search(int array[][],int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(array[i][j]==key){
                    System.out.println(key+" Found at "+"matrix ["+i+"]["+j+"]");
                    return;
                }
            }
        }
        System.out.print(key+" Not Found");
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        input(matrix);
        print(matrix);
        search(matrix, 2);
    }
}
