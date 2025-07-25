import java.util.Scanner;
class loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while (i<=n) {
            if(i % 5 == 0) {
                System.out.println( "Hello" );
            }
            else
            System.out.println( (i) );
            i++;
        }
        
    }
}