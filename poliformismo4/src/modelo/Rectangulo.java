
package Modelo;


public class Rectangulo extends FiguraGeometrica{
    
    private double altura;
    private double anchura;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double anchura, double x, double y) {
        super(x, y);
        this.altura = altura;
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    public double getArea() {
        return this.altura*this.anchura;
    }

    @Override
    public String toString() {
        return "Rectangulo (" + " Altura =" + this.altura + ", Anchura =" + anchura +", Area = "+this.getArea()+", X = "+super.getX()+", Y = "+super.getY()+")";
    }
    
    
    
    
    
}
