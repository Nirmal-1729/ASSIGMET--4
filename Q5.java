import java.util.Scanner;
class loop{
    public static void main (String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the n ");
        int n = input.nextInt();
        int i =1;
         int fact=1;
        while(i<=n){
        fact = fact*i;
        System.out.println(+fact);
        i++;
        }
   
    }
}
// 5*(5-1)*(5-2)*(5-3)(5-4)