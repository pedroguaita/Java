package introducaopoo;

import java.util.Scanner;
import entitiesObject.StaticCalculator;

public class MembrosEstaticosCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = StaticCalculator.circumference(radius);
        double v = StaticCalculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", StaticCalculator.PI);

        sc.close();
    }
}
