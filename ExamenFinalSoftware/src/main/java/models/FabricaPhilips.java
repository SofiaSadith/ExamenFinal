/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public class FabricaPhilips implements FabricaElectrodomestico{
    @Override
    public Lavadora crearLavadora(String modelo, String numSerie, String estado, double precio, double capacidad, boolean panel, int numProgramas) {
         return (Lavadora) new PhilipsLavadora(modelo, numSerie, estado, precio, capacidad, panel, numProgramas);
    }

    @Override
    public Licuadora crearLicuadora(String modelo, String numSerie, String estado, double precio, int velocidades, double potencia, String tipoVaso, boolean picaHielo) {
        return (Licuadora) new PhilipsLicuadora(modelo, numSerie, estado, precio, velocidades, potencia, tipoVaso, picaHielo);
    }
    @Override
    public Microondas crearMicroondas(String modelo, String numSerie, String estado, double precio,double capacidad, boolean panel, double potencia, boolean funcionGrill, boolean reloj, boolean cronometro){
        return (Microondas) new PhilipsMicroondas(modelo, numSerie, estado, precio, capacidad, panel, potencia, funcionGrill, reloj, cronometro);
    }

    @Override
    public Refrigerador crearRefrigerador(String modelo, String numSerie, String estado, double precio, double capacidad, boolean dispensadorAgua, boolean dispensadorHielo, boolean alarmaPuertaAbierta) {
        return (Refrigerador) new PhilipsRefrigerador(modelo, numSerie, estado, precio, capacidad, dispensadorAgua, dispensadorHielo, alarmaPuertaAbierta);
    }

    @Override
    public Stereo crearStereo(String modelo, String numSerie, String estado, double precio, int numUsb, int numParlantes, boolean karaoke, boolean ecualizador) {
        return (Stereo) new PhilipsStereo(modelo, numSerie, estado, precio, numUsb, numParlantes, karaoke, ecualizador);
    }

    @Override
    public Televisor crearTelevisor(String modelo, String numSerie, String estado, double precio, boolean bluetooth, boolean wifi, boolean controlVoz) {
        return (Televisor) new PhilipsTelevisor(modelo, numSerie, estado, precio, bluetooth, wifi, controlVoz);
    }
}
