import java.util.Scanner;

public class example_02_InchesToSentimeters {
    public static void main(String[] args) {
        Scanner console = new  Scanner(System.in);

        System.out.println("inches:");

        double inches = Double.parseDouble( console.nextLine());
        double centimeters = inches*2.54;
        System.out.println(centimeters);

    }
}
