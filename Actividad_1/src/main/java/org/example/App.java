package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Polygon circulo = new Circle(3);
        Polygon cuadrado = new Square(3);
        Polygon rectangulo = new Rectangle(3,6);

        System.out.println("El area del circulo es " + circulo.getArea() + " y tiene " + circulo.getSides() + " lados");
        System.out.println("El area del cuadrado es " + cuadrado.getArea() + " y tiene " + cuadrado.getSides() + " lados");
        System.out.println("El area del rectangulo es " + rectangulo.getArea() + " y tiene " + rectangulo.getSides() + " lados");
    }
}
