/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprincipal;

/**
 *
 * @author luis
 */
public class Coche {
    private String color;
    private String marca;
    private int numero_ruedas=4;
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String aux="El coche de color:  "+color+" es de marca: "+marca+" y tiene "+numero_ruedas+" ruedas";
        return aux; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
