/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package states;

import models.Lavadora;

/**
 *
 * @author Sofia Poma
 */
public class BrokenLavState extends LavadoraState {

    BrokenLavState(Lavadora lavadora) {
        super(lavadora);
    }

    @Override
    public String reparar() {
        lavadora.cambiarState(new RemateLavState(lavadora));
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
        return "Desmantelado.";
    }

}
