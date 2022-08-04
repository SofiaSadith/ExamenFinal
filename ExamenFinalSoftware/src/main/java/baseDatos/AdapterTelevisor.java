/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.LgTelevisor;
import models.PhilipsTelevisor;
import models.SamsungTelevisor;
import models.Televisor;

/**
 *
 * @author skynetgaming
 */
public class AdapterTelevisor extends DatoSql{
    private final LgTelevisor televisor1;
    private final SamsungTelevisor televisor2;
    private final PhilipsTelevisor televisor3;
    private Televisor producto;
    
    public AdapterTelevisor(LgTelevisor lgtv){
        this.televisor1 = lgtv;
        this.televisor2 = null;
        this.televisor3 = null;
        this.producto = lgtv;
    }
    public AdapterTelevisor(SamsungTelevisor sgtv){
        this.televisor1 = null;
        this.televisor2 = sgtv;
        this.televisor3 = null;
        this.producto = sgtv;
    }
    public AdapterTelevisor(PhilipsTelevisor phtv){
        this.televisor1 = null;
        this.televisor2 = null;
        this.televisor3 = null;
        this.producto = phtv;
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
        if(televisor1 != null){
            return "bluetooth "+televisor1.isBluetooth()+" Wifi: "+televisor1.isWifi()+" Dispensador de Hielo: "+televisor1.isControlVoz();
        }
        else if(televisor2 != null){
            return "bluetooth "+televisor2.isBluetooth()+" Wifi: "+televisor2.isWifi()+" Dispensador de Hielo: "+televisor2.isControlVoz();
        }
        else{
            return "bluetooth "+televisor3.isBluetooth()+" Wifi: "+televisor3.isWifi()+" Dispensador de Hielo: "+televisor3.isControlVoz();
        }
        
    }
}
