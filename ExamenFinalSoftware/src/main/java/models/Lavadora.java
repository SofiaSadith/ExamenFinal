/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import states.LavadoraState;

/**
 *
 * @author Sebas
 */
public abstract class Lavadora extends Electrodomestico{
    double capacidad;
    boolean panel;
    int numProgramas;
    abstract double getCapacidad();
    abstract boolean isPanel();
    abstract int getNumProgramas();
    private LavadoraState state;
    
    public void cambiarState(LavadoraState state){
        this.state=state;
    }
}
