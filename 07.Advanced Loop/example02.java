import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i> 0  ; i--) {
            System.out.println(i);
        }
    }
}
