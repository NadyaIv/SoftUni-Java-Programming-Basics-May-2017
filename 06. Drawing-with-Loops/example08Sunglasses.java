import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class example08Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int j = 0; j < 2 * n; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");

        }
        for (int j = 0; j < 2 * n; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < 2 * n - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (i == ((n +1) / 2 - 1)) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("|");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
            }
                System.out.print("*");
                for (int l = 0; l < 2 * n - 2; l++) {
                    System.out.print("/");
                }
                System.out.print("*");

            System.out.println();
        }
            for (int j = 0; j < 2 * n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * n; j++) {
                System.out.print("*");
            }
        }
    }
