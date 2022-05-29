
package Vista;

import Modelo.*;
import java.util.Scanner;


public class principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double intercambio;
        double a,b,c,d=0,e,f,g,i,j,k,l;
        
        
        System.out.println("ingrese el radio del circulo: ");
        a = entrada.nextDouble();
        System.out.println("posicion de X: ");
        b = entrada.nextDouble();
        System.out.println("posicion de Y: ");
        c = entrada.nextDouble();
        
        FiguraGeometrica cir = new Circulo(a,b,c);
        
        System.out.println("ingrese la altura del rectangulo: ");
        d = entrada.nextDouble();
        System.out.println("ingrese el largor del rectangulo: ");
        e = entrada.nextDouble();
        System.out.println("posicion de X: ");
        f = entrada.nextDouble();
        System.out.println("posicion de Y: ");
        g = entrada.nextDouble();
        
        FiguraGeometrica rec = new Rectangulo(d,e,f,g);
        
        System.out.println("----- caracteristicas de las figuras ----\n");
        System.out.println(cir);
        System.out.println("");
        System.out.println(rec);
        
        System.out.println("\n --- circulo --- ");
        System.out.println("nueva posicion de X: ");
        i= entrada.nextDouble();
        System.out.println("nueva posicion de Y: ");
        j = entrada.nextDouble();
        System.out.println("\n --- rectangulo --- ");
        System.out.println("nueva posicion de X: ");
        k = entrada.nextDouble();
        System.out.println("nueva posicion de Y: ");
        l = entrada.nextDouble();
        intercambio = d;
        
        System.out.println("----- nueva informacion -----");
        System.out.println(" --- circulo --- ");
        System.out.println("radio: "+a);
        System.out.println("posicion de X: "+i);
        System.out.println("posicion de Y: "+j);
        System.out.println("area: "+cir.getArea());
        System.out.println("");
        System.out.println(" --- rectangulo --- ");
        System.out.println("alto: "+e);
        System.out.println("largo: "+d);
        System.out.println("posicion de X: "+k);
        System.out.println("posicion de Y: "+l);
        System.out.println("area: "+rec.getArea());
        
    }
}
