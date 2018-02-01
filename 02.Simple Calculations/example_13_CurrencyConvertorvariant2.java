import java.util.Scanner;

/**
 * Created by ProBook on 31.5.2017 г..
 */
public class example_12_CurrencyConvertorvariant2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double value = Double.parseDouble(console.nextLine());
        String valuta1 = console.nextLine();
        String valuta2 = console.nextLine();
        if (valuta1.equals("BGN")) {
            if (valuta2.equals("USD")) {
                double value1 = value * 0.55695;
                System.out.printf("%.02f %s", value1, valuta2);
            } else if (valuta2.equals("EUR")) {
                double value2 = value * 0.51129;
                System.out.printf("%.02f %s", value2, valuta2);
            } else if (valuta2.equals("GBP")) {
                double value3 = value * 0.39462;
                System.out.printf("%.02f %s", value3, valuta2);
            }
        } else if (valuta1.equals("EUR")) {
            if (valuta2.equals("BGN")) {
                double value4 = value * 1.95583;
                System.out.printf("%.02f %s", value4, valuta2);
            } else if (valuta2.equals("USD")) {
                double value5 = value * 1.089301528;
                System.out.printf("%.02f %s", value5, valuta2);
            } else if (valuta2.equals("GBP")) {
                double value6 = value * 0.771819814;
                System.out.printf("%.02f %s", value6, valuta2);
            }

        } else if (valuta1.equals("GBP")) {
            if (valuta2.equals("BGN")) {
                double value7 = value * 2.53405;
                System.out.printf("%.02f %s", value7, valuta2);
            } else if (valuta2.equals("EUR")) {
                double value8 = value * 1.2956398;
                System.out.printf("%.02f %s", value8, valuta2);
            } else if (valuta2.equals("USD")) {
                double value9 = value * 1.411341751;
                System.out.printf("%.02f %s", value9, valuta2);
            }

        } else if (valuta1.equals("USD")) {
            if (valuta2.equals("BGN")) {
                double value10 = value * 1.79549;
                System.out.printf("%.02f %s", value10, valuta2);
            } else if (valuta2.equals("EUR")) {
                double value11 = value * 0.918019;
                System.out.printf("%.02f %s", value11, valuta2);
            } else if (valuta2.equals("GBP")) {
                double value12 = value * 0.708545;
                System.out.printf("%.02f %s", value12, valuta2);
            }
        }
    }
}