import java.util.Scanner;

public class example05Maxnumber {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if ( num > max){
              max = num;
            }

        }
        System.out.println(max);
    }
}
