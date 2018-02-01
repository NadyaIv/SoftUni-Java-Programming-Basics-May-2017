import java.util.Scanner;

public class example02Shop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String town = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());
        double price = 0;
        if ( "Sofia".equals(town)){
            if ("coffee".equals(product)){
                price = 0.5;
            }else if ("water".equals(product)) {
                price = 0.8;
            }else if ("beer".equals(product)) {
                price = 1.20;
            }else if ("sweets".equals(product)) {
                price = 1.45;
            }else if ("peanuts".equals(product)) {
                price = 1.60;
            }

        } else if ( "Plovdiv".equals(town)){
            if ("coffee".equals(product)){
                price = 0.4;
            }else if ("water".equals(product)) {
                price = 0.7;
            }else if ("beer".equals(product)) {
                price = 1.15;
            }else if ("sweets".equals(product)) {
                price = 1.30;
            }else if ("peanuts".equals(product)) {
                price = 1.50;
            }

        }else if ( "Varna".equals(town)){
            if ("coffee".equals(product)){
                price = 0.45;
            }else if ("water".equals(product)) {
                price = 0.70;
            }else if ("beer".equals(product)) {
                price = 1.10;
            }else if ("sweets".equals(product)) {
                price = 1.35;
            }else if ("peanuts".equals(product)) {
                price = 1.55;
            }

        }
        System.out.println(price*quantity);
    }
}
