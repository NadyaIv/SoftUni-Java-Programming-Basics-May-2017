import java.util.Scanner;

/**
 * Created by ProBook on 11.6.2017 г..
 */
public class exampel12Volleyball {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        String year = console.nextLine();
        double p = Integer.parseInt(console.nextLine());
        double h = Integer.parseInt(console.nextLine());
        double time = 0;
        if ( "leap".equals(year)){
            time =1.15*((48-h)*3/4+h+p*2/3);


        }else if ("normal".equals(year)){
            time = (48-h)*3/4+h+p*2/3;

        }
        System.out.printf("%.0f",Math.floor(time));
    }
}
