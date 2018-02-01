import java.util.Scanner;

/**
 * Created by ProBook on 6.6.2017 г..
 */
public class example11EqualWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine();
        String word2 = console.nextLine();
        if ( word1.equalsIgnoreCase(word2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
