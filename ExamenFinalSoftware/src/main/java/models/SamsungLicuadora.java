/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class SamsungLicuadora extends Licuadora{
    

    public SamsungLicuadora(String modelo, String numSerie, String estado, double precio, int velocidades, double potencia, String tipoVaso, boolean picaHielo) {
        this.marca="Samsung";
        this.modelo=modelo;
        this.numSerie=numSerie;
        this.estado=estado;
        this.precio=precio;
        this.velocidades = velocidades;
        this.potencia = potencia;
        this.tipoVaso = tipoVaso;
        this.picaHielo = picaHielo;
    }
    
    @Override
    public int getVelocidades() {
        return velocidades;
    }

    @Override
    public double getPotencia() {
        return potencia;
    }

    @Override
    public String getTipoVaso() {
        return tipoVaso;
    }

    @Override
    public boolean picaHielo() {
        return picaHielo;
    }
    
}
