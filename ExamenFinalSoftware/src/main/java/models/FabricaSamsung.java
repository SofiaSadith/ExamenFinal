/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class FabricaSamsung implements FabricaElectrodomestico{

    @Override
    public Lavadora crearLavadora(String modelo, String numSerie, String estado, int precio, double capacidad, boolean panel, int numProgramas) {
         return (Lavadora) new SamsungLavadora(modelo, numSerie, estado, precio, capacidad, panel, numProgramas);
    }

    @Override
    public Licuadora crearLicuadora(String modelo, String numSerie, String estado, int precio, int velocidades, double potencia, String tipoVaso, boolean picaHielo) {
        return (Licuadora) new SamsungLicuadora(modelo, numSerie, estado, precio, velocidades, potencia, tipoVaso, picaHielo);
    }
    @Override
    public Microondas crearMicroondas(String modelo, String numSerie, String estado, int precio,double capacidad, boolean panel, double potencia, boolean funcionGrill, boolean reloj, boolean cronometro){
        return (Microondas) new SamsungMicroondas(modelo, numSerie, estado, precio, capacidad, panel, potencia, funcionGrill, reloj, cronometro);
    }

    @Override
    public Refrigerador crearRefrigerador(String modelo, String numSerie, String estado, int precio, double capacidad, boolean dispensadorAgua, boolean dispensadorHielo, boolean alarmaPuertaAbierta) {
        return (Refrigerador) new SamsungRefrigerador(modelo, numSerie, estado, precio, capacidad, dispensadorAgua, dispensadorHielo, alarmaPuertaAbierta);
    }

    @Override
    public Stereo crearStereo(String modelo, String numSerie, String estado, int precio, int numUsb, int numParlantes, boolean karaoke, boolean ecualizador) {
        return (Stereo) new SamsungStereo(modelo, numSerie, estado, precio, numUsb, numParlantes, karaoke, ecualizador);
    }

    @Override
    public Televisor crearTelevisor(String modelo, String numSerie, String estado, int precio, boolean bluetooth, boolean wifi, boolean controlVoz) {
        return (Televisor) new SamsungTelevisor(modelo, numSerie, estado, precio, bluetooth, wifi, controlVoz);
    }
}
