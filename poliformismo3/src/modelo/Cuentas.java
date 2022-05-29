package modelo;


public abstract class Cuentas{
    int num_cuenta;
    String nombre;
    double saldo;

    public Cuentas(int num_cuenta, String nombre, double saldo) {
        this.num_cuenta = num_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Cuentas() {
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public abstract void consultar();
    public abstract void depositar();
    public abstract void retirar();
    
}
