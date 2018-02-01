import java.text.DecimalFormat;
import java.util.Scanner;

public class example11OddEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
       double oddsum = 0;
        double oddmin = Integer.MAX_VALUE;
        double oddmax = Integer.MIN_VALUE;
        double evensum = 0;
        double evenmin = Integer.MAX_VALUE;
        double evenmax = Integer.MIN_VALUE;

        DecimalFormat df = new DecimalFormat("#.############");
        for (int i = 0; i < n ; i++) {
            double number = Double.parseDouble(console.nextLine());
            if (i % 2 != 0) {

                if (number > evenmax) {
                    evenmax = number;
                }
                if (number < evenmin) {
                    evenmin = number;
                }
                evensum += number;
            }else {
                if (number > oddmax) {
                    oddmax = number;
                }
                 if (number < oddmin) {
                    oddmin = number;
                }
                oddsum += number;
            }



        }
        if ( n==1) {
            System.out.printf("OddSum =%s,\n",df.format(oddsum));
            System.out.printf("OddMin = %s,\n",df.format(oddmin));
            System.out.printf("OddMax = %s,\n",df.format(oddmax));
            System.out.println("EvenSum = 0");
            System.out.println("EvenMin = No,");
            System.out.println("EvenMax = No");
        }else if (n==0){
            System.out.println("OddSum =0,");
            System.out.println("OddMin = No,");
            System.out.println("OddMax = No,");
            System.out.println("EvenSum = 0");
            System.out.println("EvenMin = No,");
            System.out.println("EvenMax = No");



        }else{


            System.out.printf("OddSum = %s,\n",df.format(oddsum));
            System.out.printf("OddMin = %s,\n",df.format(oddmin));
            System.out.printf("OddMax = %s,\n",df.format(oddmax));
            System.out.printf("EvenSum = %s,\n",df.format(evensum));
            System.out.printf("EvenMin = %s,\n",df.format(evenmin));
            System.out.printf("EvenMax = %s\n",df.format(evenmax));

        }

        }}




