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
    public Lavadora crearLavadora(String modelo, String numSerie, String estado, double precio, double capacidad, boolean panel, int numProgramas) {
         return (Lavadora) new SamsungLavadora(modelo, numSerie, estado, precio, capacidad, panel, numProgramas);
    }

    @Override
    public Licuadora crearLicuadora(String modelo, String numSerie, String estado, double precio, int velocidades, double potencia, String tipoVaso, boolean picaHielo) {
        return (Licuadora) new SamsungLicuadora(modelo, numSerie, estado, precio, velocidades, potencia, tipoVaso, picaHielo);
    }
    
}
