import java.util.Scanner;

public class example10Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if (n % 2 == 0) {
            for (int i = 1; i <=n/2 ; i++) {

            for (int l = 1; l <= (n - 2*i) / 2; l++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int g =1; g <= 2*i-2; g++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= (n - 2*i) / 2; j++) {
                System.out.print("-");
            }
                System.out.println();
            }
            for (int i = 1; i <= n/2-1; i++) {
                for (int k = 1; k <=i ; k++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 0; j <= n-3-2*i ; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int k = 1; k <=i ; k++) {
                    System.out.print("-");
                }
                System.out.println();
                }
            }
              if ( n%2!=0 && n!=1) {
            for (int i = 1; i <= (n-1)/2; i++) {
                System.out.print("-");

            }
            System.out.print("*");

            for (int i = 1; i <= (n-1)/2; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (int i = 2; i <=n/2+1 ; i++) {
                for (int k = 1; k <= (n+1-2*i)/2 ; k++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int k = 1; k <= 2*i-3 ; k++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int k = 1; k <= (n+1-2*i)/2 ; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            for (int i = 1; i <=n/2-1 ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("-");

                }
                System.out.print("*");
                for (int j = 1; j <= n-2*i-2 ; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int j = 1; j <=i ; j++) {
                    System.out.print("-");

                }
                System.out.println();

                }
            for (int u = 1; u <= (n-1)/2; u++) {
                System.out.print("-");

            }
            System.out.print("*");
            for (int y = 1; y <= (n-1)/2; y++) {
                System.out.print("-");
            }

        }
        if ( n==1){
            System.out.println("*");
        }



        }
    }
