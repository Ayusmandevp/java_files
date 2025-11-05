class print_first_20_natural_numbers{
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=20;i++) {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nsum= "+sum);
    }
}