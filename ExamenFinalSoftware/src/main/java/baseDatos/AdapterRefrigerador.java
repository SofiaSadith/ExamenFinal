/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.LgRefrigerador;
import models.PhilipsRefrigerador;
import models.Refrigerador;
import models.SamsungRefrigerador;

/**
 *
 * @author BrunoCipriano
 */
public class AdapterRefrigerador extends DatoSql{
    private final LgRefrigerador refrigerador1;
    private final SamsungRefrigerador refrigerador2;
    private final PhilipsRefrigerador refrigerador3;
    private Refrigerador producto;
    
    public AdapterRefrigerador(LgRefrigerador lgrf){
        this.refrigerador1 = lgrf;
        this.refrigerador2 = null;
        this.refrigerador3 = null;
        this.producto = lgrf;
    }
    public AdapterRefrigerador(SamsungRefrigerador sgrf){
        this.refrigerador1 = null;
        this.refrigerador2 = sgrf;
        this.refrigerador3 = null;
        this.producto = sgrf;
    }
    public AdapterRefrigerador(PhilipsRefrigerador phrf){
        this.refrigerador1 = null;
        this.refrigerador2 = null;
        this.refrigerador3 = phrf;
        this.producto = phrf;
    }
    
    @Override
    public String getNumeroSerie() {
        
        return producto.getNumSerie();
    }
    
    @Override
    public String getNombre() {
        return producto.getMarca()+"-"+producto.getModelo();
    }
    
    @Override
    public String getDescripcion() {
        if(refrigerador1 != null){
            return "Capacidad "+refrigerador1.getCapacidad()+" Dispensador de Agua: "+refrigerador1.isDispensadorAgua()+" Dispensador de Hielo: "+refrigerador1.isDispensadorHielo()+" Alarma de puerta abierta: "+refrigerador1.isAlarmaPuertaAbierta();
        }
        else if(refrigerador2 != null){
            return "Capacidad "+refrigerador2.getCapacidad()+" Dispensador de Agua: "+refrigerador2.isDispensadorAgua()+" Dispensador de Hielo: "+refrigerador2.isDispensadorHielo()+" Alarma de puerta abierta: "+refrigerador2.isAlarmaPuertaAbierta();
        }
        else{
            return "Capacidad "+refrigerador3.getCapacidad()+" Dispensador de Agua: "+refrigerador3.isDispensadorAgua()+" Dispensador de Hielo: "+refrigerador3.isDispensadorHielo()+" Alarma de puerta abierta: "+refrigerador3.isAlarmaPuertaAbierta();
        }
        
    }
}
