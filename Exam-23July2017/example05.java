import java.util.Scanner;

/**
 * Created by ProBook on 23.7.2017 г..
 */
public class example05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int a = n;
        int b = n/2;
        int s = 5*b-5;
        for (int i = 1; i <=n/2 ; i++) {
            System.out.printf("%s%s%s%n",print(".",a),print("#",5*n-2*a),print(".",a));
            a++;
        }
        for (int i = 1; i <=n/2+1; i++) {
            System.out.printf("%s#%s#%s%n",print(".",a),print(".",5*n-2*a-2),print(".",a));
            a++;
        }
        System.out.printf("%s%s%s%n",print(".",2*n),print("#",n),print(".",2*n));
        for (int i = 1; i <=n/2 ; i++) {
            System.out.printf("%s%s%s%n", print(".",2*n-2),print("#",n+4),print(".",2*n-2));
        }
        System.out.printf("%sD^A^N^C^E^%s%n",print(".",s),print(".",s));
        for (int i = 1; i <=n/2+1 ; i++) {
            System.out.printf("%s%s%s%n", print(".",2*n-2),print("#",n+4),print(".",2*n-2));
        }


        }
    static String print(String strToRepeat, int count) {
        String text = "";
        for (int i= 0; i < count; i++) {
            text = text + strToRepeat;}
        return text;
    }
}
