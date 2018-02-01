import java.util.Scanner;

public class example04Dolars {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int n = Integer.parseInt(console.nextLine());
            for (int i = 1; i <= n; i++) {
                   for (int k=1; k<=i;k++){
                       System.out.print("$ ");
                   }
                    System.out.println();
                }
            }
        }
