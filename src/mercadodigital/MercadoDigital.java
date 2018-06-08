/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadodigital;

/**
 *
 * @author User
 */
public class MercadoDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto zapatillas = new Producto();
        
        zapatillas.setPrecioUnitario(750);
        zapatillas.setNombre("Zapatillas");
        zapatillas.setCantidad(10);
        
        System.out.println("El precio total es $"+zapatillas.getPrecio());
    }
    
}
