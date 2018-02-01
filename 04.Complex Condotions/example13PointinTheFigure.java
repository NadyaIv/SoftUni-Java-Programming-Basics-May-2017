import java.util.Scanner;

public class example13PointinTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        if (( x < 3*h && x>0 && y <h && y>0)||
                (  x>h && x<2*h && y>=h && y<4*h )) {
            System.out.println("inside");
        }else if (( x==3*h && y<=h && y>=0 )||
                ( x==0 && y<=h && y>=0)||
                ( x==h && y>=h && y<=4*h)||
                ( x==2*h && y>=h && y<=4*h)||
                ( y==0 && x>=0 && x<= 3*h)||
                ( y==h && x<=h && x>=0)||
                (y==h && x<=3*h && x>=2*h)||
                (y==4*h && x>=h && x<=2*h)){
            System.out.println("border");
        } else{
            System.out.println("outside");
        }

    }
}
