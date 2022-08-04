/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.Lavadora;
import models.LgLavadora;
import models.PhilipsLavadora;
import models.SamsungLavadora;


/**
 *
 * @author skynetgaming
 */
public class AdapterLavadora extends DatoSql{
    private final LgLavadora lavadora1;
    private final SamsungLavadora lavadora2;
    private final PhilipsLavadora lavadora3;
    private Lavadora producto;
    
    //LG Lavadora
    public AdapterLavadora(LgLavadora lglav){
        this.lavadora1 = lglav;
        this.lavadora2 = null;
        this.lavadora3 = null;
        this.producto = lglav;
    }
    
    //Samsung Lavadora
    public AdapterLavadora(SamsungLavadora sglav){
        this.lavadora1 = null;
        this.lavadora2 = sglav;
        this.lavadora3 = null;
        this.producto = sglav;
    }
    
    //Philips Lavadora
    public AdapterLavadora(PhilipsLavadora phlav){
        this.lavadora1 = null;
        this.lavadora2 = null;
        this.lavadora3 = phlav;
        this.producto = phlav;
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
        if(lavadora1 != null){
            return "Capacidad: "+lavadora1.getCapacidad()+" Panel: "+lavadora1.isPanel()+" Numero de Programas: "+lavadora1.getNumProgramas();
        }
        else if(lavadora2 != null){
            return "Capacidad: "+lavadora2.getCapacidad()+" Panel: "+lavadora2.isPanel()+" Numero de Programas: "+lavadora2.getNumProgramas();
        }
        else{
            return "Capacidad: "+lavadora3.getCapacidad()+" Panel: "+lavadora3.isPanel()+" Numero de Programas: "+lavadora3.getNumProgramas();
        }
        
    }
    
    
}
