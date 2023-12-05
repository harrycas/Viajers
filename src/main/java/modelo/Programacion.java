/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Programacion {
    
    private int idProgramacion;
    
    private Date date;
    
    private String hour;
    
    private Rutas ruta; 

    public Programacion(int id, Date date, String hour, Rutas ruta) {
        this.idProgramacion = id;
        this.date = date;
        this.hour = hour;
        this.ruta = ruta;
    }

    public int getId() {
        return idProgramacion;
    }

    public void setId(int id) {
        this.idProgramacion = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Rutas getRuta() {
        return ruta;
    }

    public void setRuta(Rutas ruta) {
        this.ruta = ruta;
    }     
    
}
