import java.util.Scanner;

/**
 * Created by ProBook on 23.7.2017 г..
 */
public class example02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int d = Integer.parseInt(console.nextLine());
        int day = Integer.parseInt(console.nextLine());
        double obshostapki =Math.ceil( n/day);
        double o = Math.ceil(0.13*obshostapki);
        double p = Math.ceil(100*obshostapki/n);
        double a = p/d;
        if ( p<=13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.",a);

        }else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.",a);

        }
    }
}
