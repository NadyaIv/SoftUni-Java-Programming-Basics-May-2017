import java.util.Scanner;


public class example_10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double radians = Double.parseDouble(console.nextLine());
        Double degrees = radians*180/Math.PI;

        System.out.print(Math.round(degrees));
    }
}
