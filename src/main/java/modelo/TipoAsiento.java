/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package modelo;

/**
 *
 * @author harryjosecastrorodriguez
 */
public enum TipoAsiento {
    
    BASICO(0),
    
    VIP(30);

    private final int precio;

    TipoAsiento(int precio) {
        
        this.precio = precio;
        
    }

    public int getPrecio() {
        
        return precio;
        
    }
    
}
