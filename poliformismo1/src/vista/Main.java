
package Vista;

import Modelo.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Producto>listaProducto = new ArrayList();
        
        Producto n = new Perecedero(2,"tetero",2000);
        listaProducto.add(n);
        
        listaProducto.add(new No_Perecedero(5,3,"remolacha",700));
        listaProducto.add(new No_Perecedero(6,1,"javon",1200));
        listaProducto.add(new Perecedero(4,"manzana",1500));
        listaProducto.add(new Perecedero(2,"Chocolate",1000));
        
        for(Producto h: listaProducto){
            imprimirProducto(h);
        }
        
    }
    
    public static void imprimirProducto(Producto h){
        System.out.println("Producto: "+ h.getNombre());
        System.out.println("Precio final: "+ h.calcularPrecio());
        System.out.println("\n");
    }
    
    
}
