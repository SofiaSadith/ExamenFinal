/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sofia Poma
 */
public class SamsungStereo extends Electrodomestico implements Stereo{
    private final int numUsb;
    private final int numParlantes;
    private final boolean karaoke;
    private final boolean ecualizador;

    public SamsungStereo(String modelo, String numSerie, String estado, double precio, int numUsb, int numParlantes, boolean karaoke, boolean ecualizador) {
        this.marca="Samsung";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.numUsb = numUsb;
        this.numParlantes = numParlantes;
        this.karaoke = karaoke;
        this.ecualizador = ecualizador;
        
    }
    
    @Override
   public int getNumUsb(){
       return numUsb;
   } 
   
    @Override
   public int getNumParlantes(){
       return numParlantes;
   }
   
    @Override
   public boolean isKaraoke(){
       return karaoke;
   }
   
    @Override
   public boolean isEcualizador(){
       return ecualizador;
   }
   
}
