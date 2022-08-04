/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public abstract class Licuadora extends Electrodomestico{
    int velocidades;
    double potencia;
    String tipoVaso;
    boolean picaHielo;
    abstract int getVelocidades();
    abstract double getPotencia();
    abstract String getTipoVaso();
    abstract boolean picaHielo();    
}
