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

/**
 *
 * @author harryjosecastrorodriguez
 */
public class DocumentoDAO {
    
    Connection conex;
    
    Conexion con = new Conexion();
    
    public int obtenerIdDocumentoDesdeTipo(String tipoDocumento) {
        
        PreparedStatement ps;
        
        ResultSet rs;
        
        int idDocumento = 0;

        try {
            
            conex = con.getConexion();
            
            ps = conex.prepareStatement("SELECT idDocumento FROM Documento WHERE type = ?");
            
            ps.setString(1, tipoDocumento);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                        idDocumento = rs.getInt("idDocumento");
                        
            }

        } catch (SQLException e) {
            
            System.out.println(e.toString());; 
            
        } finally {
            
            cerrarConexion(conex);
            
        }

        return idDocumento;
    }
    
    private void cerrarConexion(Connection connection) {
        
        try {
            if (connection != null) {
                
                connection.close();
                
            }
            
        } catch (SQLException e) {
            
            e.printStackTrace(); 
            
        }
        
    }


}
