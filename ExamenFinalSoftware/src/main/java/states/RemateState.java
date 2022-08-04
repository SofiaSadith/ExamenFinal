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
public class RemateState extends State{
    
    RemateState(Electrodomestico elec){
        super(elec);
    }

    @Override
    public String vender() {
        elec.cambiarState(new VendidoState(elec));
        return "Producto Vendido";
    }

    @Override
    public String rematar() {
        return "Producto ya en descuento.";
    }

    @Override
    public String desmantelar() {
        return "Producto Desmantelado";
    }

    @Override
    public String reparar() {
        return "Producto Funcional";
    }
    
    
    
}
