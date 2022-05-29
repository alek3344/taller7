
package vista;

import java.util.Scanner;
import modelo.Ahorro;
import modelo.Cheques;

public class main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int deci;
        int opci;
        System.out.println("su cuenta es de tipo: "
                                 + "\n1. cheques \n2. ahorro");
        deci = entrada.nextInt();
        if (deci == 1)
        {
            Cheques num = new Cheques(4322,"mailen piñeres",42000);
            num.consultar();
            System.out.println("\n que desea hacer en su cuenta? ");
            System.out.println(" \n1. consignar \n2. retirar");
            opci = entrada.nextInt();
            if (opci == 1)
            {
                num.depositar();
                num.consultar();
            }else
            {
                num.retirar();
                num.consultar();
            }
        }else
        {
            Ahorro num = new Ahorro(2323,"jose garcia",23000,"15 nov");
            num.consultar();
            System.out.println("\n que desea hacer en su cuenta? ");
            System.out.println(" \n1. consignar \n2. retirar");
            opci = entrada.nextInt();
            if (opci == 1)
            {
                num.depositar();
                num.consultar();
            }else
            {
                num.retirar();
                num.consultar();
            }
        }
    }
}
