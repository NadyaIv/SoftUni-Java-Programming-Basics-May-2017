import java.util.Scanner;

public class example03Mathpow2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 1; i<= n+1 ; i++) {
            System.out.println(num);
            num *= 2;

        }


    }}
