package modelo;

import java.util.Scanner;

public class Tractor extends Vehiculo{
    
    private double preci_dia;
    private String fecha_rect;
    private String fecha_devol;
    private String trabajo;
    private int dias;
    private double pago;

    public Tractor(){
    }

    public Tractor(double preci_dia, String fecha_rect, String fecha_devol, String trabajo, int dias, double pago, String matricula, String modelo) {
        super(matricula, modelo);
        this.preci_dia = preci_dia;
        this.fecha_rect = fecha_rect;
        this.fecha_devol = fecha_devol;
        this.trabajo = trabajo;
        this.dias = dias;
        this.pago = pago;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    public double getPreci_dia() {
        return preci_dia;
    }

    public void setPreci_dia(double preci_dia) {
        this.preci_dia = preci_dia;
    }

    public String getFecha_rect() {
        return fecha_rect;
    }

    public void setFecha_rect(String fecha_rect) {
        this.fecha_rect = fecha_rect;
    }

    public String getFecha_devol() {
        return fecha_devol;
    }

    public void setFecha_devol(String fecha_devol) {
        this.fecha_devol = fecha_devol;
    }
    
    
    @Override
    public void cap_datos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa la matricula: ");
        matricula = entrada.nextLine();
        System.out.println("ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("precio del dia: ");
        entrada.nextLine();
        preci_dia = entrada.nextDouble();
        System.out.println("ingrese el tipo de trabajo: "
                + "\n - agricola" + "\n- industrial\n");
        trabajo = entrada.nextLine();
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
                    System.out.println("dias transcurridos desde el dia de la renta: ");
                    dias = entrada.nextInt();
                    System.out.println("\n--- tractor alquilado ---");
                    break;
                case 2: 
                    alquiler = false;
                    pago = dias * preci_dia;
                    System.out.println("\n--- tractor devuelto ---");
                    break;
            }
        }
    }

    @Override
    public void mostrar() {
        System.out.println("\nmatricula: " + matricula);
        System.out.println("modelo: " + modelo);
        System.out.println("tipo de trabajo: " + trabajo);
        System.out.println("valor a pagar: " + pago);
    }
    
    
}
