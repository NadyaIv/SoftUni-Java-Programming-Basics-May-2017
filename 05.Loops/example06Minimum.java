import java.util.Scanner;


public class example06Minimum {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if ( num < min){
                min = num;
            }

        }
        System.out.println(min);
    }
}
