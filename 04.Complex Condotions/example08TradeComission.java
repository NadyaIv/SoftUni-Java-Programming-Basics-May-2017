import java.util.Scanner;

public class example08TradeComission {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine();
        double s = Double.parseDouble(console.nextLine());
        double com = -1;
        if ("Sofia".equals(town)){
            if ( s <= 500 && s>= 0){
               com = 0.05;
            } else if ( s<= 1000 && s> 500){
                com = 0.07;
            }else if ( s<= 10000 && s>1000){
                com = 0.08;
            }else if ( s>10000){
                com = 0.12;
            }

        }else if ("Varna".equals(town)){
            if ( s <= 500 && s>= 0){
                com = 0.045;
            } else if ( s<= 1000 && s> 500){
                com = 0.075;
            }else if ( s<= 10000 && s>1000){
                com = 0.10;
            }else if ( s>10000){
                com = 0.13;
            }

        }else if ("Plovdiv".equals(town)){
            if ( s <= 500 && s>= 0){
                com = 0.055;
            } else if ( s<= 1000 && s> 500){
                com = 0.08;
            }else if ( s<= 10000 && s>1000){
                com = 0.12;
            }else if ( s>10000){
                com = 0.145;
            }
        }
       if (com >0 ){
           double result = com*s;
            System.out.printf("%.2f",result);
        }else {
           System.out.println("error");
       }
    }
}
