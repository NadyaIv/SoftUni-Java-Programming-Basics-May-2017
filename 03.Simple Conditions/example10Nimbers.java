import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example10Nimbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        if (number < 100){
            System.out.println("Less than 100");
        } else if (number <=200){
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

    }
}
