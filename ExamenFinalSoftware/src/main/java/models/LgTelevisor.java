/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sofia Poma
 */
public class LgTelevisor extends Televisor{
    

    public LgTelevisor(String modelo, String numSerie, String estado, int precio, boolean bluetooth, boolean wifi, boolean controlVoz) {
        this.marca="LG";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.controlVoz = controlVoz;
    }
    
    @Override
   public boolean isBluetooth(){
       return bluetooth;
   } 
   
    @Override
   public boolean isWifi(){
       return wifi;
   }
   
    @Override
   public boolean isControlVoz(){
       return controlVoz;
   }
    
}
