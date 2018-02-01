import java.util.Scanner;

public class example10Elements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int number = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if ( num > number){
                number = num;
            }
            max += num;
        }
        if (number==(max-number)){
            System.out.printf("Yes\n" +"Sum = %d",number);
        }else{
            System.out.printf("No\n"+"Diff = %d\n",Math.abs((number-(max-number))));
        }

    }

}
