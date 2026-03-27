package Entidade;

public class Triangulo {
    double lado1;
    double lado2;
    double lado3;


    public void lados(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area () {
        double p = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

}
