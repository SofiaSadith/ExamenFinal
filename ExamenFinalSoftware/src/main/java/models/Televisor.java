/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sofia Poma
 */
public abstract class Televisor extends Electrodomestico{
    boolean bluetooth;
    boolean wifi;
    boolean controlVoz;
    abstract boolean isBluetooth();
    abstract boolean isWifi();
    abstract boolean isControlVoz();
       
}
