/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author skynetgaming
 */
public abstract class Refrigerador extends Electrodomestico{
    double capacidad;
    boolean dispensadorAgua;
    boolean dispensadorHielo;
    boolean alarmaPuertaAbierta;
    abstract double getCapacidad();
    abstract boolean isDispensadorAgua();
    abstract boolean isDispensadorHielo();
    abstract boolean isAlarmaPuertaAbierta();
}
