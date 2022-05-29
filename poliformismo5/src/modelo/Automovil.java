package modelo;

import java.util.Scanner;

public class Automovil extends VehiculoMotorizado{

    Scanner entrada = new Scanner(System.in);
    String respu;
    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String año_fabric, double kilometraje) {
        super(fabricante, modelo, año_fabric, kilometraje);
    }

    public String getRespu() {
        return respu;
    }

    public void setRespu(String respu) {
        this.respu = respu;
    }
    
    public void datos()
    {
        System.out.println("ingrese fabricante: ");
        fabricante = entrada.nextLine();
        System.out.println("ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("ingrese el año de fabricacion: ");
        año_fabric = entrada.nextLine();
        System.out.println("ingrese el kilometraje: ");
        kilometraje = entrada.nextDouble();
    }
    
    public String medidasSeguridad()
    {
        int pasaj;
        int opci;
        System.out.println("que estilo de automovil es: ");
        System.out.println(" 1. VAN   2. estandar   3. otro ");
        opci = entrada.nextInt();
        System.out.println("que cantidad de pasajeros lleva: ");
        pasaj = entrada.nextInt();
        if(opci == 1)
        {
            CapacidadLimite num = new CapacidadLimite();
            respu = num.Van(pasaj);
        }else
        {
            CapacidadLimite num1 = new CapacidadLimite();
            respu = num1.limite(pasaj);
        }
        
        return respu;
    }
    
    public void mostrar()
    {
        System.out.println("fabricante: " + fabricante);
        System.out.println("modelo: " + modelo);
        System.out.println("año de fabricacion: " + año_fabric);
        System.out.println("kilometraje: " + kilometraje);
        System.out.println(respu);
    }
    
}
