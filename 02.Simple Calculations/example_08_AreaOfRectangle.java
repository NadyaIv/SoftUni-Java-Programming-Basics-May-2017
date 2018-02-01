import java.util.Scanner;


public class example_07_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double x1 = Double.parseDouble(console.nextLine());
        Double y1 = Double.parseDouble(console.nextLine());
        Double x2 = Double.parseDouble(console.nextLine());
        Double y2 = Double.parseDouble(console.nextLine());
        Double area = Math.abs(x1-x2)*Math.abs(y1-y2);
        Double perimeter = 2*(Math.abs(x1-x2)+Math.abs(y1-y2));
        System.out.println( "area = "+area);
        System.out.println( "perimeter = "+perimeter);

    }
}
