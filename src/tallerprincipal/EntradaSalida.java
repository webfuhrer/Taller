/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprincipal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luis
 */
class EntradaSalida {
    private static Scanner sc=new Scanner(System.in);
    static int mostrarMenu() {
        int opcion=0;
        System.out.println("Introduzca una opción");
        System.out.println("1-Insertar coche\n");
        System.out.println("2-Listar coche/-s\n");
        System.out.println("3-Salir\n");
        try
        {
        opcion=sc.nextInt();
        }
        catch(InputMismatchException excepcion)
        {
            System.out.println("Valor no permitido");
        }
        sc.nextLine();
        return opcion;
    }

    static Coche pedirCoche() {
        System.out.println("Introduzca el color");
        String color=sc.nextLine();
        System.out.println("Introduzca la marca");
        String marca=sc.nextLine();
        Coche c=new Coche(color, marca);
        return c;
    }

    static void mostrarCoches(Coche[] lista_coches) {
        //Método Luis
        /*for (int i=0; i<lista_coches.length; i++)
        {
            /*
            System.out.println("Coche con color: "+lista_coches[i].getColor()+
                    " y marca: "+lista_coches[i].getMarca());*/
        /*  Coche c=lista_coches[i];
          System.out.println("Coche comn color: "+c.getColor()+" y marca "+c.getMarca());
          
            System.out.println(c.toString());
        }*/
        //Método Andrés
        System.out.println("¿QUé posición de coche quieres mostrar?");
        int i=sc.nextInt();
        try
        {
        Coche c=lista_coches[i-1];
        System.out.println(c.toString());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No hay tantos coches");
        }
        
                
        
    }
    
}
