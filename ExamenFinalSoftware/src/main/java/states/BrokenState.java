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
public class BrokenState extends State {

    public BrokenState(Electrodomestico elec) {
        super(elec);
    }

    @Override
    public String reparar() {
        elec.cambiarState(new RemateState(elec));
        return "Producto Reparado.";
    }

    @Override
    public String vender() {
        return "Producto Dañado.";
    }

    @Override
    public String rematar() {
        return "Producto Dañado.";
    }

    @Override
    public String desmantelar() {
        elec.cambiarState(new EnPartesState(elec));
        return "Desmantelado.";
    }

}
