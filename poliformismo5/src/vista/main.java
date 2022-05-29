package vista;

import java.util.Scanner;
import modelo.*;

public class main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int opci;
        
        
        System.out.println(" que vehiculo desea gestionar: ");
        System.out.println("1. automovil \n2. motocicleta \n3. camion");
        opci = entrada.nextInt();
        if (opci == 1)
        {
            Automovil rum = new Automovil();
            rum.datos();
            rum.medidasSeguridad();
            rum.mostrar();
        }else
            {
                if (opci ==2)
                {
                    Motocicleta rum = new Motocicleta();
                    rum.datos();
                    rum.medidasSeguridad();
                    rum.mostrar();
                }else
                    {
                        Camion rum = new Camion();
                        rum.datos();
                        rum.medidasSeguridad();
                        rum.mostrar();
                    }
            }        
    }   
}
