import java.util.Scanner;

public class example_09_CelsiusToFraenhait {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Double celsius = Double.parseDouble(console.nextLine());
        Double Farenhait = celsius*1.8 +32;
        System.out.printf("%.2f Farenhait",Farenhait);
    }
}
