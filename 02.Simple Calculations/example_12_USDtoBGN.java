import java.util.Scanner;


public class example_11_USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double USD = Double.parseDouble(console.nextLine());
        Double BGN = USD * 1.79549;

        System.out.printf(" %.2f BGN", BGN);
    }
}
