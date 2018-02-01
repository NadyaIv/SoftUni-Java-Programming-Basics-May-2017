import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        int f0= 1;
        int f1=1;
        for (int i = 0; i <n-1; i++) {
            int fnext = f0+f1;
            f0=f1;
            f1=fnext;
        }
        System.out.println(f1);
    }
}
