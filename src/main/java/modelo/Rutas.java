/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Rutas {
    
    int id;
    
    String origin, destination;
    
    float price;

    public Rutas(int id, String origin, String destination, float price) {
        
        this.id = id;
        
        this.origin = origin;
        
        this.destination = destination;
        
        this.price = price;
        
    }

    public int getId() {
        
        return id;
    
    }

    public void setId(int id) {
        
        this.id = id;
        
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

    public float getPrice() {
        
        return price;
        
    }

    public void setPrice(float price) {
        
        this.price = price;
        
    }
    
}