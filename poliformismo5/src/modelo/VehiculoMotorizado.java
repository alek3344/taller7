
package modelo;

public class VehiculoMotorizado {
    
    String fabricante;
    String modelo;
    String año_fabric;
    double kilometraje;

    public VehiculoMotorizado(String fabricante, String modelo, String año_fabric, double kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año_fabric = año_fabric;
        this.kilometraje = kilometraje;
    }

    public VehiculoMotorizado() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño_fabric() {
        return año_fabric;
    }

    public void setAño_fabric(String año_fabric) {
        this.año_fabric = año_fabric;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    
}
