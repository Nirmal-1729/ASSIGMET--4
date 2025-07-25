import java.util.Scanner;
class loop{
    public static void main (String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("enter the Number");
      int n= input.nextInt();
      char a='1';
      int i=1;
      while(i<=n){
        if (i<=n)
        System.out.print(a);
        i++;
      }
          
    }
}