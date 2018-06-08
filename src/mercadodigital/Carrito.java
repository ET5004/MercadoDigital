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
public class Carrito {
    public Producto [] productos;
    
    /**
     * @param cantidadMaxima La cantidad maxima de productos diferentes a comprar.
     */
    public Carrito(int cantidadMaxima){
        productos = new Producto[cantidadMaxima];
    }
    /**
     * @param producto El producto a insertar.
     * 
     * @return true si insertó, false si está lleno
     */
    
    public boolean insertar(Producto producto){
        int lugarVacio = 0;
        while(lugarVacio<productos.length && productos[lugarVacio] != null){
            lugarVacio++;
        }
        if(lugarVacio<productos.length){
            productos[lugarVacio] = producto;
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
