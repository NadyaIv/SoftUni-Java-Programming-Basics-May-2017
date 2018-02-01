import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example15EqualNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        double num3 = Double.parseDouble(console.nextLine());
        if ( num1 == num2 && num2 == num3 && num3 == num1){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
