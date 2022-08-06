/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.LgMicroondas;
import models.Microondas;
import models.PhilipsMicroondas;
import models.SamsungMicroondas;

/**
 *
 * @author BrunoCipriano
 */
public class AdapterMicroondas extends DatoSql{
    private final LgMicroondas microondas1;
    private final SamsungMicroondas microondas2;
    private final PhilipsMicroondas microondas3;
    private Microondas producto;
    
    public AdapterMicroondas(LgMicroondas lgmc){
        this.microondas1 = lgmc;
        this.microondas2 = null;
        this.microondas3 = null;
        this.producto = lgmc;
    }
    public AdapterMicroondas(SamsungMicroondas sgmc){
        this.microondas1 = null;
        this.microondas2 = sgmc;
        this.microondas3 = null;
        this.producto = sgmc;
    }
    public AdapterMicroondas(PhilipsMicroondas phmc){
        this.microondas1 = null;
        this.microondas2 = null;
        this.microondas3 = phmc;
        this.producto = phmc;
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
        if(microondas1 != null){
            return "Capacidad "+microondas1.getCapacidad()+" Panel: "+microondas1.isPanel()+" Potencia: "+microondas1.getPotencia()+" Funcion Grill: "+microondas1.isFuncionGrill()+" Reloj: "+ microondas1.isReloj()+" Cronometro: "+microondas1.isCronometro();
        }
        else if(microondas2 != null){
            return "Capacidad "+microondas2.getCapacidad()+" Panel: "+microondas2.isPanel()+" Potencia: "+microondas2.getPotencia()+" Funcion Grill: "+microondas2.isFuncionGrill()+" Reloj: "+ microondas2.isReloj()+" Cronometro: "+microondas2.isCronometro();
        }
        else{
            return "Capacidad "+microondas3.getCapacidad()+" Panel: "+microondas3.isPanel()+" Potencia: "+microondas3.getPotencia()+" Funcion Grill: "+microondas3.isFuncionGrill()+" Reloj: "+ microondas3.isReloj()+" Cronometro: "+microondas3.isCronometro();
        }
        
    }
}
