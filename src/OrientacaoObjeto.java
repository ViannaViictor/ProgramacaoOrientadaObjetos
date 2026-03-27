import java.util.Scanner;
import java.util.Locale;

public class OrientacaoObjeto {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3;
        double lado4, lado5, lado6;
        double p1, p2;
        double area1, area2;

        System.out.println("Digite os lados do Triangulo 1: ");
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();

        System.out.println("Digite os lados do Triangulo 2: ");
        lado4 = sc.nextDouble();
        lado5 = sc.nextDouble();
        lado6 = sc.nextDouble();

        p1 = (lado1 + lado2 + lado3) / 2.0;
        p2 = (lado4 + lado5 + lado6) / 2.0;

        area1 = Math.sqrt(p1 * (p1 - lado1) * (p1 - lado2) * (p1 - lado3));
        area2 = Math.sqrt(p2 * (p2 - lado4) * (p2 - lado5) * (p2 - lado6));

        System.out.printf("Area Triangulo 1: %.4f%n", area1);
        System.out.printf("Area Triangulo 2: %.4f%n", area2);

        if (area1 > area2) {
            System.out.println("Maior Area: Triangulo 1");
        }else {
            System.out.println("Maior Area: Triangulo 2");
        }

    sc.close();
    }
}
