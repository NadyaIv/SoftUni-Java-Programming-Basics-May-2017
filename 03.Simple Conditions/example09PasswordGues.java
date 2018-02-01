import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example09PasswordGues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String pasword = console.nextLine();
        if ( pasword.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
