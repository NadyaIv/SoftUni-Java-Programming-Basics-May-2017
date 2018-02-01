import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class example_06_AreaOfCircle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double r = Double.parseDouble(console.nextLine());
        Double area = Math.PI*r*r;
        Double perimeter = 2*Math.PI*r;
        System.out.println("area = "+area);
        System.out.println("perimeter = "+perimeter);

    }
}
