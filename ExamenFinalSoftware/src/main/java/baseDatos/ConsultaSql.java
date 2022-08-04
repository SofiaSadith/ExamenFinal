/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author skynetgaming
 */
public class ConsultaSql {
    Conexion conex = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public void consultar(){
        String sql = "select * from productos";
        try{
            conet = conex.conectar();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] producto = new Object[3];
            
            while(rs.next()){
                producto[0] = rs.getString("NumeroSerie");
                producto[1] = rs.getString("Nombre");
                producto[2] = rs.getString("Descripcion");
                System.out.println("No Serie: " + producto[0]);
                System.out.println("Nombre: " + producto[1]);
                System.out.println("Descripcion: " + producto[2]);
                System.out.println("-------------------------");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void anadirElemento(String nrSerie, String nombre, String desc){
        String sql = "INSERT INTO productos (NumeroSerie, Nombre, Descripcion) VALUES (\'"+nrSerie+"\', \'"+nombre+"\', \'"+desc+"\');";
        try{
            conet = conex.conectar();
            st = conet.createStatement();
            st.executeUpdate(sql);
            System.out.println("Se a agregado el elemento correctamente");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    
}
