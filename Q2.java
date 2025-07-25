import java.util.Scanner;
class loop{
    public static void main(String args []){
        Scanner input =new Scanner(System.in);
         System.out.println("Enter the value of n :");
        int n=input.nextInt();
        int i=1;

        while(i<=n){
            System.out.println(i);
            i++;

        }
    }
}