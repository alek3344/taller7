
package Modelo;

public class No_Perecedero extends Perecedero{
    
    private double iva;
    double preciof;
    
    public No_Perecedero() {
    }

    public No_Perecedero(double iva, int noDiasCaducar, String nombre, double precio) {
        super(noDiasCaducar, nombre, precio);
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public double getPreciof() {
        
        super.getPreciof();
        preciof = super.getPreciof() + (super.getPreciof()*(this.iva/100));
        return preciof;
    }

}
