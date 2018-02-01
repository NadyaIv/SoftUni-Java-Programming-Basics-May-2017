import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class example12Thesamecouple {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        double result = 0;
        double max=Double.MIN_VALUE;
        double result1 =0;
        double max1 =0;
        double max2 = 0;
        double num1= Double.parseDouble(console.nextLine());
        double num2= Double.parseDouble(console.nextLine());
        result = num1+num2;
            for (int j = 1; j <=n-1 ; j++) {
                double num3 = Double.parseDouble(console.nextLine());
                double num4 = Double.parseDouble(console.nextLine());
                max2 =Math.abs( result1-(num3+num4));
                if(max2>max){
                    max = max2;
                }
                result1 = num3 + num4;
                max1 = Math.abs(result - result1);
                if (max1 > max) {
                    max = max1;
                }


            }
        if (max1 ==0){
            System.out.printf("Yes, value=%.0f",result);
        }else{
            System.out.printf("No, maxdiff=%.0f",max);
        }
        }
        }
        

    

