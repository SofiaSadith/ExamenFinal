/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

/**
 *
 * @author BrunoCipriano
 */
public class DatoSql {
    public String marca;
    public String modelo;
    private String numeroSerie;
    public double precio;
    public String estado;
    
    /*
    public DatoSql(String numeroSerie, String nombre, String descripcion) {
        this.numeroSerie = numeroSerie;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    */
    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }   
    
    public String getNombre(){
        return marca+"-"+modelo;
    }
    
     public String getDescripcion(){
        return modelo+"-"+numeroSerie;
    }
    
    
}
