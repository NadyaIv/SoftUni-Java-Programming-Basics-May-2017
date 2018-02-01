import java.util.Scanner;

public class example07Cristmastree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= i-1; f++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("");
            }
            for (int f = 1; f <= i-1; f++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }


