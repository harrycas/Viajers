/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Asiento {    
    
    int asiento_id, nro;
    
    Reserva reserva_id;
    
    TipoAsiento tipo;
    
    EstadoAsiento estadoAsiento;

    public Asiento(int nro, Reserva reserva_id, TipoAsiento tipo, EstadoAsiento estadoAsiento) {
        this.nro = nro;
        this.reserva_id = reserva_id;
        this.tipo = tipo;
        this.estadoAsiento = estadoAsiento;
    }

    public int getAsiento_id() {
        return asiento_id;
    }

    public void setAsiento_id(int asiento_id) {
        this.asiento_id = asiento_id;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Reserva getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(Reserva reserva_id) {
        this.reserva_id = reserva_id;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }

    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    
}
