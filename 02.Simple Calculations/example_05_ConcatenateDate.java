import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;


public class example_04_ConcatenateDate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstname = console.nextLine();
        String lastname = console.nextLine();
        int age = Integer.parseInt( console.nextLine());
        String town = console.nextLine();
        System.out.printf(" You are %s %s, a %d-years old person from %s.",firstname,lastname,age,town);

    }
}
