/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bmmar
 */
public class Asiento {
    
    public enum State{
        DISPONIBLE, RESERVADO, OCUPADO
    }
    
    int asiento_id;
    Reserva reserva_asiento;
    TipoAsiento tipo;
    int nro;
    State state;

    public Asiento(int asiento_id, Reserva reserva_asiento, TipoAsiento tipo, int nro, State state) {
        this.asiento_id = asiento_id;
        this.reserva_asiento = reserva_asiento;
        this.tipo = tipo;
        this.nro = nro;
        this.state = state;
    }

    public int getAsiento_id() {
        return asiento_id;
    }

    public void setAsiento_id(int asiento_id) {
        this.asiento_id = asiento_id;
    }

    public Reserva getReserva_asiento() {
        return reserva_asiento;
    }

    public void setReserva_asiento(Reserva reserva_asiento) {
        this.reserva_asiento = reserva_asiento;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    
}
