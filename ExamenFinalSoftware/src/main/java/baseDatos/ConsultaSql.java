/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import models.Electrodomestico;

/**
 *
 * @author BrunoCipriano
 */
public class ConsultaSql {

    Conexion conex = new Conexion();
    Connection conet = conex.conectar();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public void consultar(DefaultTableModel model) {
        String sql = "select * from productos";
        try {
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] producto = new Object[5];

            while (rs.next()) {
                producto[0] = rs.getString("Marca");
                producto[1] = rs.getString("Modelo");
                producto[2] = rs.getString("NumSerie");
                producto[3] = rs.getString("Precio");
                producto[4] = rs.getString("Estado");
                model.addRow(producto);
                System.out.println("Marca: " + producto[0]);
                System.out.println("Modelo: " + producto[1]);
                System.out.println("NumSerie: " + producto[2]);
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

   
    //Añadir elemento con datoSql
    public void anadirElemento(Electrodomestico dato) {
        String sql = "INSERT INTO productos (Marca, Modelo, NumSerie, Precio, Estado) VALUES (\'" + dato.getMarca() + "\',\'" + dato.getModelo() + "\',\'" + dato.getNumSerie() + "\', \'" + dato.getPrecio() + "\', \'" + dato.getEstado() + "\');";
        try {
            st = conet.createStatement();
            st.executeUpdate(sql);
            System.out.println("Se ha agregado el elemento correctamente");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    //Añadir elemento con elementos
    public void anadirElementoStr(String marca,String mod,String s,int p,String e) {
        String sql = "INSERT INTO productos (Marca, Modelo, NumSerie, Precio, Estado) VALUES (\'" + marca + "\',\'" + mod + "\',\'" + s + "\', \'" + p + "\', \'" + e + "\');";
        try {
            st = conet.createStatement();
            st.executeUpdate(sql);
            System.out.println("Se ha agregado el elemento correctamente");

        } catch (SQLException er) {
            System.out.println(er);
        }
    }
    
    //Borrar elemento con datoSql
    public void borrarElemento(DatoSql dato) {
        String sql = "DELETE FROM productos WHERE NumSerie= \'" + dato.getNumeroSerie() + "\';";
        try {
            st = conet.createStatement();
            st.executeUpdate(sql);
            System.out.println("Se ha eliminado el elemento correctamente");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    
    
    
}
