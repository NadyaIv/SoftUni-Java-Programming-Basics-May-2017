import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example14TimeFifteenMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        int minuti = Integer.parseInt(console.nextLine());
        int minuti2 = minuti+15;
        if (minuti2<= 59 ){
            System.out.println(hour+":"+minuti2);
        } else if ( minuti2 < 69){
            int hour2 = hour+1;
            if (hour2 == 24 ){
                hour2 = 0;
            }
            int minuti3 = (minuti2 -60);
            System.out.println(hour2+":0"+minuti3);
        } else {
            int minuti3 = minuti2%60;
            int hour2 = hour + 1;
            if (hour2 == 24) {
                hour2 = 0;
            }
            System.out.println(hour2+":"+minuti3);
        }


    }
}
