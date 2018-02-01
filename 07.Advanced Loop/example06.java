import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number in the range [1...100]:");
        int n = Integer.parseInt(console.nextLine());

        while ( n<1 || n >100)  {
            System.out.println("Invalid number");
            n = Integer.parseInt(console.nextLine());
        }

        System.out.printf("The number is %d",n);
    }
}



