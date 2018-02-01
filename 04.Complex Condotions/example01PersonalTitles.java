import java.util.Scanner;

public class example01PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();
        if ( age< 16){
            if (("f").equals(gender)){
                System.out.println("Miss");
            }else{
                System.out.println("Master");
            }
        } else {
            if (("f").equals(gender)){
                System.out.println("Ms.");
            }else{
                System.out.println("Mr.");
            }
        }
    }
}
