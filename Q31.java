import java.util.Scanner;   
class loop {
      
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt(); 
        int i = 1;
        long num = 9;

        while (i <= n) {
            System.out.println(num);
            num = num * 10 + 9;
            i++;
        }
    }
}