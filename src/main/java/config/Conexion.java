/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harryjosecastrorodriguez
 */
public class Conexion {
    
    public Connection getConexion() {
        
    
        try {
            
             Class.forName("com.mysql.jdbc.Driver");
            
            //Crear conexión
            Connection connBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_inso", "root", "");
            
            System.out.println("Conexión a la base de datos exitosa");
            
            return connBD;
            
        } catch(SQLException e) {
            
            System.out.println("Error al establecer la conexión: " + e.getMessage());
            
            return null;
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
            
        }
        
    }

}
