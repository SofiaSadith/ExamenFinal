/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sofia Poma
 */
public abstract class Stereo extends Electrodomestico{
    int numUsb;
    int numParlantes;
    boolean karaoke;
    boolean ecualizador;
    abstract int getNumUsb();
    abstract int getNumParlantes();
    abstract boolean isKaraoke();
    abstract boolean isEcualizador();
    
}
