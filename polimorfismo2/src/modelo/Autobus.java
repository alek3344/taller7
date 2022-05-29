package modelo;

import java.util.Scanner;


public class Autobus extends Vehiculo{
    
    private double pre_kilo;
    private double cant_kill_renta;
    private double cant_kill_devol;
    private int num_acientos;
    private double precio;

    public Autobus(){
    }

    public Autobus(double pre_kilo, double cant_kill_renta, double cant_kill_devol, int num_acientos,double precio, String matricula, String modelo) {
        super(matricula, modelo);
        this.pre_kilo = pre_kilo;
        this.cant_kill_renta = cant_kill_renta;
        this.cant_kill_devol = cant_kill_devol;
        this.num_acientos = num_acientos;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }    

    public int getNum_acientos() {
        return num_acientos;
    }

    public void setNum_acientos(int num_acientos) {
        this.num_acientos = num_acientos;
    }

    public double getPre_kilo() {
        return pre_kilo;
    }

    public void setPre_kilo(double pre_kilo) {
        this.pre_kilo = pre_kilo;
    }

    public double getCant_kill_renta() {
        return cant_kill_renta;
    }

    public void setCant_kill_renta(double cant_kill_renta) {
        this.cant_kill_renta = cant_kill_renta;
    }

    public double getCant_kill_devol() {
        return cant_kill_devol;
    }

    public void setCant_kill_devol(int cant_kill_devol) {
        this.cant_kill_devol = cant_kill_devol;
    }
    
    

    @Override
    public void cap_datos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa la matricula: ");
        matricula = entrada.nextLine();
        System.out.println("ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("precio del kilometro: ");
        pre_kilo = entrada.nextDouble();
        System.out.println("ingrese el numero de acientos: ");
        num_acientos = entrada.nextInt();
    }
    
    @Override
    public void alquiler() {
        Scanner entrada = new Scanner(System.in);
        boolean alquiler = true;
        int val;
        while(alquiler != false)
        {
            System.out.println("\nque desea? "
                + "\n1. alquilar" + "\n2. devolver");
            val = entrada.nextInt();
            switch (val)
            {
                case 1:                    
                    alquiler = true;
                    System.out.println("cantidad de kilometrosl al alquilar: ");
                    cant_kill_renta = entrada.nextDouble();
                    System.out.println("cantidad de kilometrosl al devolver:");
                    cant_kill_devol = entrada.nextDouble();
                    System.out.println("--- autobus alquilado ---");
                    break;
                case 2: 
                    alquiler = false;
                    System.out.println("--- autobus devuelto ---");
                    precio = (cant_kill_devol - cant_kill_renta) * pre_kilo;    
            }
        } 
    }

    @Override
    public void mostrar() {
        System.out.println("\nmatricula: " + matricula);
        System.out.println("modelo: " + modelo);
        System.out.println("numero de acientos: " + num_acientos);
        System.out.println("valor a pagar: " + precio);
    }

    
    
    
}
