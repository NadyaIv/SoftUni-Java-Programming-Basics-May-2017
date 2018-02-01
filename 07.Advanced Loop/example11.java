import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by ProBook on 4.7.2017 г..
 */
public class example11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true){
            try {
                int n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered:%d", n);
                    break;
                }
            } catch (Exception ex){
                System.out.println("Invalid number");
            }
        }
    }
}
