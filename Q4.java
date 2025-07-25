import java.util.Scanner;
class loop{
    public static void main (String args[]){
        Scanner input =new Scanner(System.in);
        System.out.print("enter the n ");
        int n = input.nextInt();
        int i =1;
       
        while(i<=10){
            int table = n*i;
        System.out.println( +n ""+table );
        i++;
        }
    }
}