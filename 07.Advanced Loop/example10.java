import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;


public class example10 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int n = Integer.parseInt(console.nextLine());
        boolean b = true;
        if (n<2){
            System.out.println("Not prime");
        }else{
        for (int i = 2; i<=Math.sqrt(n) ; i++) {
            if( n%i==0){
                b = false;
                System.out.println("Not prime");
                break;
            }

        }
      if (b) {
          System.out.println("Prime");
      }
      }
    }}

