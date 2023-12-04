    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PasajeroDAO {
    
        Connection conex;
        Conexion con = new Conexion();
    
    public boolean registrarPasajero(Pasajero pasajero) {
        
        PreparedStatement ps;

        try {
            
            conex = con.getConexion();
                    
            ps = conex.prepareStatement("INSERT INTO pasajero (name, lastName, birthday, cellphone, sex, mail, nro_doc) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, pasajero.getName());
            ps.setString(2, pasajero.getLastName());
            ps.setString(2, pasajero.getBirthday());
            ps.setString(4, pasajero.getCellphone());
            ps.setString(5, pasajero.getSex());
            ps.setString(6, pasajero.getMail());
            ps.setString(7, pasajero.getDoc().getNro());
                      
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
    
        } catch (SQLException e) {
            System.out.println(e.toString());
            // Manejar la excepción según tus necesidades
            return false;
        }
        
    }
    
}

