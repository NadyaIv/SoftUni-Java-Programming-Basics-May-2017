import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
            System.out.print("+ ");
            for (int j = 1; j <= n-2 ; j++) {
                System.out.print("- ");
            }
            System.out.print("+ ");
            System.out.println();
        for (int i = 2; i <=n-1 ; i++) {
            System.out.print("| ");
            for (int j = 1; j <= n-2 ; j++) {
                System.out.print("- ");
            }
            System.out.print("| ");
            System.out.println();
        }
        System.out.print("+ ");
        for (int j = 1; j <= n-2 ; j++) {
            System.out.print("- ");
        }
        System.out.print("+ ");
        System.out.println();
    }
}


