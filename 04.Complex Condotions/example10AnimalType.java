import java.util.Scanner;

/**
 * Created by ProBook on 11.6.2017 г..
 */
public class example10AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        switch (name) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:System.out.println("unknown");

        }
    }
}
