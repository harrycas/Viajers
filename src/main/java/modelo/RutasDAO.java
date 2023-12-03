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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class RutasDAO {
    
    Connection conex;
    
    Conexion con = new Conexion();
    
    public RutasDAO() {
    
    }
    
    public List<String> listarCiudadesOrigen() {
        
        PreparedStatement ps;
        
        ResultSet rs;
        
        List<String> ciudadesOrigen = new ArrayList<>();
        
        try {
            
            conex = con.getConexion();
            
            ps = conex.prepareStatement("SELECT DISTINCT origin FROM Ruta");
            
            rs = ps.executeQuery();
            
            System.out.println("Consulta SQL: " + ps.toString());  // Imprime la consulta SQL
            
            while (rs.next()) {
                
                ciudadesOrigen.add(rs.getString("origin"));
                        
            }
            
        } catch (SQLException e) {         
            
            System.out.println(e.toString());
            
        }
        
        return ciudadesOrigen;
        
    }
    
    
    public List<String> listarCiudadesDestino(String ciudadOrigen) {
        
        PreparedStatement ps;
        
        ResultSet rs;
        
        List<String> ciudadesDestino = new ArrayList<>();

        try {
            
            
            conex = con.getConexion();
            
            ps = conex.prepareStatement("SELECT destination FROM Ruta WHERE origin = ?");
            
            ps.setString(1, ciudadOrigen);

            rs = ps.executeQuery();

            while (rs.next()) {
                
                ciudadesDestino.add(rs.getString("destination"));
                
            }

        } catch (SQLException e) {
            
            System.out.println(e.toString());
            
        }

        return ciudadesDestino;
    }
    
}
