import sun.util.locale.provider.DateFormatProviderImpl;

import java.util.Scanner;


public class example06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char a = console.nextLine().charAt(0);
        char b = console.nextLine().charAt(0);
        char c = console.nextLine().charAt(0);
        char d = console.nextLine().charAt(0);
        int n = Integer.parseInt(console.nextLine());
        int counter = 0;
        for (char i ='A'; i <=a ; i++) {
            for ( char j = 'a'; j <=b ; j++) {
                for (char k = 'a'; k <=c ; k++) {
                    for (int l = 'a'; l <=d ; l++) {
                        for (int m = 0; m <=n ; m++) {
                            counter++;

                        }

                    }

                }

            }

        }
        System.out.println(counter-1);
}
}
