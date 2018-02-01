import java.util.Scanner;

/**
 * Created by ProBook on 9.6.2017 г..
 */
public class example17Price {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String day = console.nextLine();
        if (n < 20 && day.equals("day")) {
            double price = 0.70 +0.79*n;
            System.out.printf("%.2f",price);

    } else if ( n < 20 && day.equals("night")){
            double price = 0.70 +0.90*n;
            System.out.printf("%.2f",price);
        }else if ( n < 100 ){
            double price = 0.09*n;
            System.out.printf("%.2f",price);
        }else {
            double price = 0.06*n;
            System.out.printf("%.2f",price);

        }

    }
}
