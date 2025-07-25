import java.util.Scanner;
class loop{
    public static void main(String args []){
        Scanner input =new Scanner(System.in);
         System.out.println("Enter the value of n :");
        int n=input.nextInt();
        int i=0;
        int a=2;

        while(i<=n){
            int b= i*a+1;
            i++;
             System.out.println(b);
        }
         
    }
}