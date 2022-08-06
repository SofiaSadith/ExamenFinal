/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import states.State;

/**
 *
 * @author Sebas
 */
public abstract class Electrodomestico {

    String marca;
    String modelo;
    String numSerie;
    String estado;
    int precio;
    boolean descuento;
    
    State state;
    
    public void cambiarState(State state){
        this.state=state;
    }
    
    public State getState(){
        return state;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public String getEstado() {
        return estado;
    }

    public int getPrecio() {
        return precio;
    }
    public boolean getDescuento() {
        return descuento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setDescuento(boolean descuento){
         this.descuento = descuento; 
    }
}
