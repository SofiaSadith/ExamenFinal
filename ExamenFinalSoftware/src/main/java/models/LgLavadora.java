/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import states.BrokenState;

/**
 *
 * @author Sebas
 */
public class LgLavadora extends Lavadora{
    
    
    
    public LgLavadora(String modelo, String numSerie, String estado, int precio, double capacidad, boolean panel, int numProgramas){
        this.marca="LG";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;       
        this.capacidad = capacidad;
        this.panel = panel;
        this.numProgramas = numProgramas;
        this.state=new BrokenState(this);
    }


    @Override
    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public boolean isPanel() {
        return panel;
    }

    @Override
    public int getNumProgramas() {
        return numProgramas;
    }
    
}
