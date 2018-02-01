import java.util.Scanner;

/**
 * Created by ProBook on 11.6.2017 г..
 */
public class example11Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type = console.nextLine();
        int r = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        double price = 0;
        switch ( type){
            case "Premiere" :price = 12.0*r*c;break;
            case "Normal": price = 7.50*r*c;break;
            case "Discount": price = 5*r*c;break;
        }
        System.out.printf("%.2f leva",price);
    }
}
