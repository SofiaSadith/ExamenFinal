/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Sebas
 */
public interface FabricaElectrodomestico {
    Lavadora crearLavadora(String modelo, String numSerie, String estado, double precio, double capacidad, boolean panel, int numProgramas);
    Licuadora crearLicuadora(String modelo, String numSerie, String estado, double precio, int velocidades, double potencia, String tipoVaso, boolean picaHielo);
    Microondas crearMicroondas(String modelo, String numSerie, String estado, double precio,double capacidad, boolean panel, double potencia, boolean funcionGrill, boolean reloj, boolean cronometro);
    Refrigerador crearRefrigerador(String modelo, String numSerie, String estado, double precio,double capacidad, boolean dispensadorAgua, boolean dispensadorHielo, boolean alarmaPuertaAbierta);
    Stereo crearStereo(String modelo, String numSerie, String estado, double precio, int numUsb, int numParlantes, boolean karaoke, boolean ecualizador);
    Televisor crearTelevisor(String modelo, String numSerie, String estado, double precio, boolean bluetooth, boolean wifi, boolean controlVoz);
}
