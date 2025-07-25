import java.util.Scanner;   
class loop {
      
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt(); 
        int i = 1;
        long num = 1;
        long sum=1;

        while (i <= n) {
            System.out.println(sum);
            num= num * 10+ 1;
            sum += num;
            i++;
        }
    }
}