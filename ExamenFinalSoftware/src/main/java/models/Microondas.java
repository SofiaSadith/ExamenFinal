/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author BrunoCipriano
 */
public abstract class Microondas extends Electrodomestico{
    double capacidad;
    boolean panel;
    double potencia;
    boolean funcionGrill;
    boolean reloj;
    boolean cronometro;
    abstract double getCapacidad();
    abstract boolean isPanel(); 
    abstract double getPotencia();
    abstract boolean isFuncionGrill();
    abstract boolean isReloj();
    abstract boolean isCronometro();
}
