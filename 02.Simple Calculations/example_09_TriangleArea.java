import java.util.Scanner;


public class example_08_TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double a = Double.parseDouble(console.nextLine());
        Double h = Double.parseDouble(console.nextLine());
        Double area = (a*h)/2;
        System.out.printf("area = %.2f",area);
    }
}
