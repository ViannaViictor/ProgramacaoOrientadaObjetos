import java.util.Scanner;
import java.util.Locale;
import Entidade.Triangulo;

public class OrientacaoObjeto {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Digite os lados do Triangulo 1: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        x.lados(lado1, lado2, lado3);

        System.out.println("Digite os lados do Triangulo 2: ");
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();
        y.lados(lado1, lado2, lado3);

        double area1 = x.area();
        double area2 = y.area();

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
