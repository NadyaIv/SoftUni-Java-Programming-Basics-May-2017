import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example13Areafiguri {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figura = console.nextLine();
        if (figura.equals("square")){
         double side = Double.parseDouble(console.nextLine());
         double area = side*side;
            System.out.printf("%.3f",area);
        }
        if (figura.equals("rectangle")){
            double side1 = Double.parseDouble(console.nextLine());
            double side2 = Double.parseDouble(console.nextLine());
            double area = side1*side2;
            System.out.printf("%.3f",area);
        }
        if (figura.equals("circle")){
            double radius = Double.parseDouble(console.nextLine());
            double area = Math.PI*radius*radius;
            System.out.printf("%.3f",area);
        }
        if (figura.equals("triangle")){
            double side1 = Double.parseDouble(console.nextLine());
            double side2 = Double.parseDouble(console.nextLine());
            double area =(side1*side2)/2;
            System.out.printf("%.3f",area);
        }
    }
}
