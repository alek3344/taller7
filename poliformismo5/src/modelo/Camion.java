package modelo;

import java.util.Scanner;

public class Camion extends VehiculoMotorizado{

    Scanner entrada = new Scanner(System.in);
    String[] respu;
    int j;
    public Camion() {
    }

    public Camion(String fabricante, String modelo, String año_fabric, double kilometraje) {
        super(fabricante, modelo, año_fabric, kilometraje);
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
    
    public void medidasSeguridad()
    {
        int n;
        System.out.println("cuantos remolques desea verificar? :");
        j = entrada.nextInt();
        respu = new String[j];
        CapacidadLimite num = new CapacidadLimite();
        num.camion(j);
    }
    
    public void mostrar()
    {
        System.out.println("\nfabricante: " + fabricante);
        System.out.println("modelo: " + modelo);
        System.out.println("año de fabricacion: " + año_fabric);
        System.out.println("kilometraje: " + kilometraje);
        CapacidadLimite rum = new CapacidadLimite();
        rum.mostrarcamion(j);
    }
    
}
