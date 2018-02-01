import java.util.Scanner;

public class example_05_TrazpezoidArea {
    public static void main(String[] args) {
        Scanner console = new Scanner ( System.in);
        Double b1 = Double.parseDouble(console.nextLine());
        Double b2 = Double.parseDouble(console.nextLine());
        Double h = Double.parseDouble(console.nextLine());
        System.out.println((b1+b2)*h/2);
    }
}
