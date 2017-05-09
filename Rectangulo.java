
package Rectangulo;

public class Rectangulo {

    private  double ancho;
    private double altura;
     
    public Rectangulo (){
           this.ancho = 1;
           this.altura =1;
    }
    public Rectangulo (double ancho, double altura){
        this.ancho = ancho;
        this.altura = altura;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho (double ancho){
          this.ancho = 1;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura (double altura){
          this.altura = 1;
    }
    public double getArea(){
          return ancho = altura;
    }
    
    public double getPerimetro(){
          return 2 * ancho + 2 * altura;
    }
    
public static void main (String [] args){
        Rectangulo r =new Rectangulo (4, 40);
        Rectangulo r1 =new Rectangulo (3.5, 35.9);
        System.out.println ("EL ANCHO DEL RECTANGULO ES : " + r.getAncho());
        System.out.println ("LA ALTURA DEL RECTANGULO ES : " + r.getAltura());
        System.out.println ("EL AREA DEL RECTANGULO ES : " + r.getArea());
        System.out.println ("EL PERIMETRO DEL RECTANGULO ES : " + r.getPerimetro());
    }
}