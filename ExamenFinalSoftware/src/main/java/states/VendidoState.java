/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package states;

import models.Electrodomestico;

/**
 *
 * @author Sofia Poma
 */
public class VendidoState extends State {
    
    public VendidoState(Electrodomestico elec){
        super(elec);
    }

    @Override
    public String reparar() {
        return "Ya ha sido vendido.";
    }

    @Override
    public String vender() {
        return "Ya ha sido vendido.";
    }

    @Override
    public String rematar() {
        return "Ya ha sido vendido.";
    }

    @Override
    public String desmantelar() {
        return "Ya ha sido vendido.";
    }
    
    
    
}
