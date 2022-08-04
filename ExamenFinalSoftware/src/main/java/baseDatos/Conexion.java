/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skynetgaming
 */
public class Conexion {
    String bd="tiendabd";
    String url= "jdbc:mysql://localhost:3306/";
    String usuario="root";
    String contrasena="";
    String driver ="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    //Constructor
    public Conexion(){
    }
    
    
    //Conectar a la base de datos
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, usuario,contrasena);
            System.out.println("Se pudo conectar a la base de datos "+bd);
            return cx;
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println("No se pudo conectar a la base de datos "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);      
        }
        return cx;
    }
    
    //Desconectar a la base de datos
    public String desconectar(){
        try {
            cx.close();
            return "Base de datos desconectada";
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error al desconectar la base de datos";
    }
    
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.conectar();
    }
    
}