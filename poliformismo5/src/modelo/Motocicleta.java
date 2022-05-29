package modelo;

import java.util.Scanner;

public class Motocicleta extends VehiculoMotorizado {

    Scanner entrada = new Scanner(System.in);
    String respu;
    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modelo, String año_fabric, double kilometraje) {
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
    
    public void medidasSeguridad()
    {
        int n;
        System.out.println("cuantos pasajeros van en su moto: ");
        n = entrada.nextInt();
        CapacidadLimite num = new CapacidadLimite();
        respu = num.moto(n);
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
