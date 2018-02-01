import java.util.Scanner;


public class example08OddorEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (i%2 == 0){
                sumeven +=num;
            }else{
                sumodd +=num;
            }

        }
        if ( sumeven == sumodd){
            System.out.printf("Yes\n" +
                     "Sum\n = %d",sumeven);
        }else{
            System.out.printf("No\n"+"Diff = %d\n",Math.abs(sumeven-sumodd));
        }
    }

}
