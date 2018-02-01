import java.util.Scanner;

/**
 * Created by ProBook on 23.7.2017 г..
 */
public class example03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int dancer = Integer.parseInt(console.nextLine());
        double point = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        String place = console.nextLine();
        double money = 0;
        if ( "Bulgaria".equals(place)){
            money = point*dancer;
            if ("summer".equals(season)) {

                money=0.95*money;
            }else{
                money=0.92*money;
            }
        }else{
            money = 1.5*point*dancer;
            if ("summer".equals(season)) {

                money=0.90*money;
            }else{
                money=0.85*money;
            }

        }
       double moneybl = 0.75*money;
        double moneyp = 0.25*money/dancer;
        System.out.printf("Charity - %.2f",moneybl);
        System.out.println();
        System.out.printf("Money per dancer - %.2f",moneyp);
    }
}
