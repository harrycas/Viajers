/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class PasajeroDAO {
    
    Connection conex;
    
    Conexion con = new Conexion();
    
    public boolean registrarPasajero(Pasajero pasajero) {
        
        PreparedStatement ps;

        try {
            
            conex = con.getConexion();
                    
            ps = conex.prepareStatement("INSERT INTO pasajero (idPasajero, name, lastName, birthday, cellphone, sex, mail, doc_type) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, pasajero.getIdPasajero());
            ps.setString(2, pasajero.getName());
            ps.setString(3, pasajero.getLastName());
            ps.setString(4, pasajero.getBirthday());
            ps.setString(5, pasajero.getCellphone());
            ps.setString(6, pasajero.getSex());
            ps.setString(7, pasajero.getMail());
            ps.setInt(8, pasajero.getDocID());
                      
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
    
        } catch (SQLException e) {
            System.out.println(e.toString());
            // Manejar la excepción según tus necesidades
            return false;
        }
        
    }
    
}
