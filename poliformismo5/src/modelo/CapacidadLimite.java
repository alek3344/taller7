package modelo;

import java.util.Scanner;

public class CapacidadLimite {
    
    int pasajeros;
    int van;
    String[] respu;

    public CapacidadLimite() {
    }

    public CapacidadLimite( int pasajeros, int van) {
        this.pasajeros = pasajeros;
        this.van = van;
    }


    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }
    
    public String limite(int n)
    {
        int limite = 4;
        String respu="null";
        if (n > limite)
        {
            respu = " --- excedio el limite de pasajeros ---";
        }else
        {
            respu = " --- pasajeros estables ---";
        }
        return respu;
    }
    
    public String Van(int n)
    {
        String van="null";
        int limite = 6;
        if (n > limite)
        {
            van = " --- excedio el limite de pasajeros ---";
        }else
        {
            van = " --- pasajeros suficientes --- ";
        }
        return van;
    }
    
    public String moto(int n)
    {
        int limite = 2;
        String respu="null";
        if (n > limite)
        {
            respu = " --- excedio el limite de pasajeros ---";
        }else
        {
            respu = " --- pasajeros estables ---";
        }
        return respu;
    }
    
    public void camion(int j)
    {
        Scanner entrada = new Scanner(System.in);
        int limite = 4;
        int n;
        respu = new String[j];
        for (int i=1; i<=j; i++)
        {
            System.out.println("cuantos pasajeros van en su camion: ");
            n = entrada.nextInt();
            if (n > limite)
            {
                respu[i-1] = " --- excedio el limite de pasajeros ---";
            }else
            {
                respu[i-1] = " --- pasajeros estables ---";
            }
        }
    }
    
    public void mostrarcamion(int j)
    {
        for (int i=1; i<=j; i++)
        {
            System.out.println("\n --- camion #" + i +" ---");
            System.out.println(respu[i-1]);
        }
    }
    
}
