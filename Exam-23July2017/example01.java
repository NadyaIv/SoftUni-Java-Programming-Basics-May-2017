import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double L = Double.parseDouble(console.nextLine());
        double W = Double.parseDouble(console.nextLine());
        double A = Double.parseDouble(console.nextLine());
        double zala = L*W;
        double garderob  =A*A;
        double skameika = zala/10;
        double obsho = zala-garderob-skameika;
        double danser = obsho*100*100/7040;
        double danser1 = Math.floor(danser);
        System.out.printf("%.0f",danser1);
    }
}
