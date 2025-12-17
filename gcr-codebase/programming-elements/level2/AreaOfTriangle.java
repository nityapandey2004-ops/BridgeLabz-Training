import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;

        double baseInch = baseCm / 2.54;
        double heightInch = heightCm / 2.54;
        double areaInch = 0.5 * baseInch * heightInch;

        System.out.println ("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }
}
