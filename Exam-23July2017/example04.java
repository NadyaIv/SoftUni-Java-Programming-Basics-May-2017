import java.util.Scanner;

/**
 * Created by ProBook on 23.7.2017 г..
 */
public class example04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = Integer.parseInt(console.nextLine());
        int dancer = Integer.parseInt(console.nextLine());
        double procent = 0;
        double procent1 = 0;
        double procent2=0;
        double procent3=0;
        double procent4=0;
        for (int i = 1; i <=day ; i++) {
            int hour = Integer.parseInt(console.nextLine());
            if ( i%2==0 && hour%2==0){
                procent1 += 68;
            }else if(i%2!=0 && hour%2==0){
                procent2 += 49;
            }else if (i%2==0 && hour%2!=0){
                procent3 += 65;
            }else if (i%2!=0 && hour%2!=0){
                procent4 += 30;
            }

        }
procent = dancer*(procent1+procent2+procent3+procent4);
        double obsho = 100*day*dancer;
        double a = obsho-procent;
        double perparson = a/day/dancer;
        double s =100* a/obsho;
        if ( perparson>=50){
            System.out.printf("They feel good! Energy left: %.2f",perparson);
        }else{
            System.out.printf("They are wasted! Energy left: %.2f",perparson);
        }

    }
}
