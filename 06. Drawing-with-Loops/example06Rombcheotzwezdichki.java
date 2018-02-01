import java.util.Scanner;

public class example06Rombcheotzwezdichki {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int k = 1; k <= n-1; k++) {
            for (int j = 1; j <=k ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-k ; j++) {
                System.out.print("* ");

            }
            System.out.println();
            
        }
    }
    
    
}
