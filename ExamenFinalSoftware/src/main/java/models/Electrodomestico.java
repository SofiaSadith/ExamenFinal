/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public abstract class Electrodomestico {

    String marca;
    String modelo;
    String numSerie;
    String estado;
    Double precio;

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
