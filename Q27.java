import java.util.Scanner;
class loop{
    public static void main (String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("enter the Number");
      int n= input.nextInt();
     
      int i=0;
      while(i<=n){
        if (i%2==0)
        System.out.print( '*');
        else
        System.out.print( '#' );
        i++;
      }

        
    }
}