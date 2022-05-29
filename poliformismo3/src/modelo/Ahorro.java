package modelo;

import java.util.Scanner;

public class Ahorro extends Cuentas{

    Scanner entrada = new Scanner(System.in);
    private String fechavenc;
    
    public Ahorro() {
    }

    public Ahorro(int num_cuenta, String nombre, double saldo,String fechavenc) {
        super(num_cuenta, nombre, saldo);
        this.fechavenc = fechavenc;
    }

    public String getFechavenc() {
        return fechavenc;
    }

    public void setFechavenc(String fechavenc) {
        this.fechavenc = fechavenc;
    }
    
    @Override
    public void consultar() {
        System.out.println("\nnumero de cuenta: " + num_cuenta);
        System.out.println("nombre dle titular: " + nombre);
        System.out.println("saldo registrado: " + saldo);
        System.out.println("fecha de vencimiento del año 2020: " + fechavenc);
    }

    @Override
    public void depositar() {
        float comision; 
        float consig;
        /* calculamos la comision por interes mensual */
        System.out.println(" --- calculando comision ---"); 
        comision = (float) ((13 * saldo) / 100);
        System.out.println(" comision de interes mensual: " + comision);
        System.out.println("ingrese la cantidad que desea añadir: ");
        consig = entrada.nextFloat();
        saldo = saldo + consig - comision;
        
    }

    @Override
    public void retirar() {
        float comision;
        float consig = 0;
        String comparacion;
        System.out.println(" \n--- calculando comision ---"); 
        comision = (float) ((13 * saldo) / 100);
        System.out.println("comision por uso de cuenta: " + comision);
            System.out.println("\nen que dia desea retirar el dinero: ");
            comparacion = entrada.nextLine();
                if (comparacion.equals(fechavenc))
                {
                    System.out.println("\nque cantidad desea retirar: ");
                    consig = entrada.nextFloat();
                    if (consig > saldo)
                    {
                        System.out.println("\n   ---saldo insuficiente---\n");
                        System.out.println("-- retiro mayor que el saldo --");
                        entrada.nextLine();
                    }else
                    {
                        if (comision > saldo-consig)
                        {
                            System.out.println("\n   --- saldo insuficiente --- ");
                            System.out.println("-- comision mayor que el saldo --");
                            entrada.nextLine();
                        }else
                        {
                            saldo = saldo - consig - comision;
                            System.out.println(" --- retiro exitoso ---");
                        }
                    }
                } else {
                    System.out.println("-- solo se puede retirar el la fecha de vencimiento --");
                }
    }
    
}
