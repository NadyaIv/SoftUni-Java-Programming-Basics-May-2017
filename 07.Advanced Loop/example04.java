import java.util.Scanner;

/**
 * Created by ProBook on 3.7.2017 г..
 */
public class example04 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 1; i <= n+1; i+=2) {
            System.out.println(num);
            num *= 4;

        }
    }
}
