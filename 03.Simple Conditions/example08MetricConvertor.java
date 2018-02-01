import java.util.Scanner;

/**
 * Created by ProBook on 4.6.2017 г..
 */
public class example08MetricConvertor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double metric = Double.parseDouble(console.nextLine());
        String edinica1 = console.nextLine();
        String edinica2 = console.nextLine();
        if (edinica1.equals("mm")){
            metric=metric/1000;
        }else if (edinica1.equals("cm")){
            metric=metric/100;
        }else if (edinica1.equals("mi")){
            metric=metric/0.000621371192;
        }else if (edinica1.equals("in")){
            metric=metric/39.3700787;
        }else if (edinica1.equals("km")){
            metric=metric/0.001;
        }else if (edinica1.equals("ft")){
            metric=metric/3.2808399;
        }else if (edinica1.equals("yd")){
            metric=metric/1.0936133;
        }
        if (edinica2.equals("mm")){
             metric=metric*1000;
        }else if (edinica2.equals("cm")){
             metric=metric*100;
        }else if (edinica2.equals("mi")){
             metric=metric*0.000621371192;
        }else if (edinica2.equals("in")){
             metric=metric*39.3700787;
        }else if (edinica2.equals("km")){
            metric=metric*0.001;
        }else if (edinica2.equals("ft")){
            metric=metric*3.2808399;
        }else if (edinica2.equals("yd")){
            metric=metric*1.0936133;
        }
        System.out.printf("%.8f %s",metric,edinica2);


    }
    }

