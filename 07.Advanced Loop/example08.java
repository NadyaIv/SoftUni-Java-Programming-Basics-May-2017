import java.util.Scanner;


public class example08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 1;
        for (int i = 1; i <= n ; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
