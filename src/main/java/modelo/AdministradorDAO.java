/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bmmar
 */
public class AdministradorDAO {
    
    public boolean validarUsuario(String username, String password) {
        boolean valido = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Aquí debes establecer tu conexión a la base de datos
            // connection = TuClaseConexion.obtenerConexion();

            String query = "SELECT * FROM administrador WHERE administrador = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            valido = resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en producción
        } finally {
            // Cerrar resultSet, preparedStatement y connection aquí
        }

        return valido;
    }
    
    
}
