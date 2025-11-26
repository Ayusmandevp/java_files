import java.util.Scanner;
public class binarytooctal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary num: ");
        String binary=sc.nextLine();
        String octal="";
        while(binary.length()%3!=0){
            binary='0'+binary;
        }
        for(int i=0;i<binary.length();i+=3){
            int sum=0;
            int base=4;
            for(int j=i;j<i+3;j++){
                sum+=(binary.charAt(j) - '0')*base;
                base/=2;
            }
            octal+=String.valueOf(sum);
        }
        System.out.println("Octal is "+octal);
        sc.close();
    }
}