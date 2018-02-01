import java.util.Scanner;


public class example04Fruits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        if (("banana").equals(product) ||
                ("apple").equals(product) ||
                ("kiwi").equals(product) ||
                ("cherry").equals(product) ||
                ("lemon").equals(product) ||
                ("grapes").equals(product)) {
            System.out.println("fruit");
        }else if(("tomato").equals(product) ||
                ("cucumber").equals(product) ||
                ("pepper").equals(product) ||
                ("carrot").equals(product) ){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }
    }
}
