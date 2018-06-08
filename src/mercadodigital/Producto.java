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
public class Producto {
    private String nombre;
    private float precioUnitario;
    private float descuento;
    private float cantidad;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return El descuento como porcentaje
     */
    public float getDescuento() {
        return descuento*100;
    }

    /**
     * @param descuento El descuento como porcentaje
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento/100;
        
    }

    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Calcula el precio con descuento por la cantidad de productos.
     * 
     * @return El precio total
     */
    public float getPrecio(){
        return precioUnitario * cantidad * (1-descuento);
    }
}
