import java.util.Scanner;


public class example07SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int secunda1= Integer.parseInt(console.nextLine());
        int secunda2= Integer.parseInt(console.nextLine());
        int secunda3= Integer.parseInt(console.nextLine());
        int secunda = secunda1 + secunda2+secunda3;
        int minuti = secunda/60;
        int totalsecunda= secunda%60;

         if ( totalsecunda < 10) {
            System.out.println(minuti+":0"+totalsecunda);
        } else  {
             System.out.println(minuti+":"+totalsecunda);

        }
    }
}
