
package Modelo;

public class Perecedero extends Producto{
    
    private int dias_cad;
    double preciof;

    public Perecedero() {
    }

    public Perecedero(int dias_cad, String nombre, double precio) {
        super(nombre, precio);
        this.dias_cad = dias_cad;
    }

    public int getDias_cad() {
        return dias_cad;
    }

    public void setDias_cad(int dias_cad) {
        this.dias_cad = dias_cad;
    }
    
    @Override
    public double getPreciof() {
        if (dias_cad==1)
        {
            preciof = super.getPrecio()/4;
        }else 
            {
                if (dias_cad==2)
                {
                    preciof = super.getPrecio()/3;
                }else
                    {
                        if (dias_cad==3)
                        {
                            preciof = super.getPrecio()/2;
                        }else
                            {
                                preciof=this.getPrecio();
                            }
                    }
            }
        return preciof; 
    }
    
    
    
}
