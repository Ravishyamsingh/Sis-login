import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius : ");
        double r=sc.nextInt(); //r ---> Radius
        double ans=circle(r);
        System.out.println(ans);

    }
    static double circle(double r) {
        return Math.PI * r * r;
    }

}
