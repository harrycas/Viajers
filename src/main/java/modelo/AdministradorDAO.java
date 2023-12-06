/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class AdministradorDAO {
    
    Connection conex;
    
    Conexion con = new Conexion();
    
    public boolean validarUsuario(String username, String password) {

        PreparedStatement ps;
        
        ResultSet rs;
        
        boolean valido = false;

        try {
            
            conex = con.getConexion();
            
            ps = conex.prepareStatement("SELECT * FROM administrador WHERE username = ? AND password = ?");

            ps.setString(1, username);
            
            ps.setString(2, password);

            rs = ps.executeQuery();

            valido = rs.next();
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        } finally {
            
            try {
                
                conex.close();
                
            } catch (SQLException ex) {
                
                Logger.getLogger(DocumentoDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }

        return valido;
        
    }   
    
}
