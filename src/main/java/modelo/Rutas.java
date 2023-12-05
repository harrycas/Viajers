/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Rutas {
    
    private int idRuta;
    
    private String origin, destination;
    
    private BigDecimal price;

    public Rutas(int id, String origin, String destination, BigDecimal price) {
        
        this.idRuta = id;
        
        this.origin = origin;
        
        this.destination = destination;
        
        this.price = price;
        
    }

    public int getId() {
        
        return idRuta;
    
    }

    public void setId(int id) {
        
        this.idRuta = id;
        
    }

    public String getOrigin() {
        
        return origin;
        
    }

    public void setOrigin(String origin) {
        
        this.origin = origin;
        
    }

    public String getDestination() {
        
        return destination;
        
    }

    public void setDestination(String destination) {
        
        this.destination = destination;
        
    }

    public BigDecimal getPrice() {
        
        return price;
        
    }

    public void setPrice(BigDecimal price) {
        
        this.price = price;
        
    }
    
}