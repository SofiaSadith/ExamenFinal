/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import models.LgStereo;
import models.PhilipsStereo;
import models.SamsungStereo;
import models.Stereo;

/**
 *
 * @author skynetgaming
 */
public class AdapterStereo extends DatoSql{
    private final LgStereo stereo1;
    private final SamsungStereo stereo2;
    private final PhilipsStereo stereo3;
    private Stereo producto;
    
    public AdapterStereo(LgStereo lgst){
        this.stereo1 = lgst;
        this.stereo2 = null;
        this.stereo3 = null;
        this.producto = lgst;
    }
    public AdapterStereo(SamsungStereo sgst){
        this.stereo1 = null;
        this.stereo2 = sgst;
        this.stereo3 = null;
        this.producto = sgst;
    }
    public AdapterStereo(PhilipsStereo phst){
        this.stereo1 = null;
        this.stereo2 = null;
        this.stereo3 = phst;
        this.producto = phst;
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
        if(stereo1 != null){
            return "Numero de Usb "+stereo1.getNumUsb()+" Numero de parlantes: "+stereo1.getNumParlantes()+" Karaoke: "+stereo1.isKaraoke()+" Ecualizador: "+stereo1.isEcualizador();
        }
        else if(stereo2 != null){
            return "Numero de Usb "+stereo2.getNumUsb()+" Numero de parlantes: "+stereo2.getNumParlantes()+" Karaoke: "+stereo2.isKaraoke()+" Ecualizador: "+stereo2.isEcualizador();
        }
        else{
            return "Numero de Usb "+stereo3.getNumUsb()+" Numero de parlantes: "+stereo3.getNumParlantes()+" Karaoke: "+stereo3.isKaraoke()+" Ecualizador: "+stereo3.isEcualizador();
        }
        
    }
}
