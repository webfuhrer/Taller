/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprincipal;

public class TallerPrincipal {

    public static void main(String[] args) {
        Coche[] lista_coches=new Coche[3];
        int opcion_seleccionada=EntradaSalida.mostrarMenu();
        while(opcion_seleccionada!=3)
        {
            switch(opcion_seleccionada)
            {
                case 1:
                    //Insertar coches
                    for (int i=0; i<lista_coches.length; i++)
                    {
                        lista_coches[i]=EntradaSalida.pedirCoche();
                    }
                    break;
                case 2:
                    
                    EntradaSalida.mostrarCoches(lista_coches);
                    break;
            }
            opcion_seleccionada=EntradaSalida.mostrarMenu();
        }
    }
    
}