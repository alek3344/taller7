
package Modelo;


public abstract class FiguraGeometrica {
    
    private double x;
    private double y;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public abstract double getArea();
    
    public double calcularArea(){
        return this.getArea();
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + " x =" + x + ", y = " + y + '}';
    }
    
}
