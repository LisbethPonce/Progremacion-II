
package Triangulo;

import Triangulo.Triangulo;
public class TestTriangulo {
    
    public static void main (String [] args){
     Triangulo tri = new Triangulo (1, 1.5, 1, 4, 5);
     ObjetoGeometrico og;
     og = tri;
     System.out.println ("EL AREA DEL TRIANGULO ES : " + og.getArea());
     System.out.println ("EL PERIMETRO DEL TRIANGULO ES : " + og.getPerimetro());

    }
}
