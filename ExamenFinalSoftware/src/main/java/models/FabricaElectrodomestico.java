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
}
