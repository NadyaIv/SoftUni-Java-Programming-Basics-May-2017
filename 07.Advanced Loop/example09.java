import java.util.Scanner;

public class example09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        while ( n != 0) {
            int a = n % 10;
            sum += a;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
