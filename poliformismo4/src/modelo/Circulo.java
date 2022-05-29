
package Modelo;


public class Circulo extends FiguraGeometrica{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   
    @Override
    public double getArea(){
        return Math.PI*(this.radio*this.radio);
    }

    @Override
    public String toString() {
        return "Circulo{" + " radio = " + radio + ", Area = "+this.getArea()+", X= "+this.getX()+", Y = "+this.getY()+"}";
    }
    
    
    
}
