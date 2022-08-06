/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.LgLicuadora;
import models.Licuadora;
import models.PhilipsLicuadora;
import models.SamsungLicuadora;

/**
 *
 * @author BrunoCipriano
 */
public class AdapterLicuadora extends DatoSql{
    private final LgLicuadora licuadora1;
    private final SamsungLicuadora licuadora2;
    private final PhilipsLicuadora licuadora3;
    private Licuadora producto;
    
    //LG Lavadora
    public AdapterLicuadora(LgLicuadora lglic){
        this.licuadora1 = lglic;
        this.licuadora2 = null;
        this.licuadora3 = null;
        this.producto = lglic;
    }
    
    //Samsung Lavadora
    public AdapterLicuadora(SamsungLicuadora sglic){
        this.licuadora1 = null;
        this.licuadora2 = sglic;
        this.licuadora3 = null;
        this.producto = sglic;
    }
    
    //Philips Lavadora
    public AdapterLicuadora(PhilipsLicuadora phlic){
        this.licuadora1 = null;
        this.licuadora2 = null;
        this.licuadora3 = phlic;
        this.producto = phlic;
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
        if(licuadora1 != null){
            return "Numero de velocidades: "+licuadora1.getVelocidades()+" Potencia: "+licuadora1.getPotencia()+" Tipo de vaso: "+licuadora1.getTipoVaso()+"Pica Hielo: "+licuadora1.picaHielo();
        }
        else if(licuadora2 != null){
            return "Numero de velocidades: "+licuadora2.getVelocidades()+" Potencia: "+licuadora2.getPotencia()+" Tipo de vaso: "+licuadora2.getTipoVaso()+"Pica Hielo: "+licuadora2.picaHielo();
        }
        else{
            return "Numero de velocidades: "+licuadora3.getVelocidades()+" Potencia: "+licuadora3.getPotencia()+" Tipo de vaso: "+licuadora3.getTipoVaso()+"Pica Hielo: "+licuadora3.picaHielo();
        }
        
    }
}
