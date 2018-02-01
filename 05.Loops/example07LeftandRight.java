import java.util.Scanner;

public class example07LeftandRight {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sumleft = 0;
        int sumright = 0;
        for (int i = 1; i <= n ; i++) {
            int leftnum = Integer.parseInt(console.nextLine());
          sumleft  += leftnum;
        }
        for (int i = 1; i <= n ; i++) {
            int rightnum = Integer.parseInt(console.nextLine());
           sumright  += rightnum;
        }
        if ( sumleft == sumright ){
            System.out.printf("Yes, sum = %d",sumright);

        }else {
            System.out.printf("No, diff = %d",Math.abs(sumleft-sumright));
        }
    }
}
