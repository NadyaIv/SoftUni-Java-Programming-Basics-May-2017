import java.util.Scanner;

public class example09TheHouse {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= (n+1)/2; i++) {
            if (n % 2 == 0) {
                for (int j = 1; j <= (n - 2 * i) / 2; j++) {
                    System.out.print("-");
                }
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n - 2 * i) / 2; j++) {
                    System.out.print("-");
                }
                System.out.println();

            }else{
                for (int j = 1; j <= (n+1)/2-i; j++) {
                System.out.print("-");
            }
                for (int j = 1; j <=(2*i-1); j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (n +1)/2-i ; j++) {
                    System.out.print("-");
                }
                System.out.println();

            }

        }
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print("|");
            for (int j = 1; j <=n-2; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}

