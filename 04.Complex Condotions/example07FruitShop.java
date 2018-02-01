import java.util.Scanner;

/**
 * Created by ProBook on 11.6.2017 г..
 */
public class example07FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String day = console.nextLine();
        double price = -1;
        double qantity = Double.parseDouble(console.nextLine());
        if (("Monday").equals(day) ||
                ("Tuesday").equals(day) ||
                ("Wednesday").equals(day) ||
                ("Thursday").equals(day) ||
                ("Friday").equals(day) ){
            if (("banana").equals(product)){
                price = 2.50;
            }else if (("apple").equals(product)){
                price = 1.20;
            }else if (("orange").equals(product)){
                price = 0.85;
            }else if (("grapefruit").equals(product)){
                price = 1.45;
            }else if (("kiwi").equals(product)){
                price = 2.70;
            }else if (("pineapple").equals(product)){
                price = 5.50;
            }else if (("grapes").equals(product)){
                price = 3.85;
            }
        }else if (("Sunday").equals(day) ||
                ("Saturday").equals(day)){
            if (("banana").equals(product)){
                price = 2.70;
            }else if (("apple").equals(product)){
                price = 1.25;
            }else if (("orange").equals(product)){
                price = 0.90;
            }else if (("grapefruit").equals(product)){
                price = 1.60;
            }else if (("kiwi").equals(product)){
                price = 3.00;
            }else if (("pineapple").equals(product)){
                price = 5.60;
            }else if (("grapes").equals(product)){
                price = 4.20;
            }

        }
        if ( price >0){
            System.out.println(qantity*price);
        }else{
            System.out.println("error");
        }

    }
}
