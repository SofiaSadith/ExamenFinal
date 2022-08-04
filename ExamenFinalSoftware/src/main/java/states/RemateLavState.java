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
public class RemateLavState extends LavadoraState{
    
    RemateLavState(Lavadora lavadora){
        super(lavadora);
    }

    @Override
    public String vender() {
        lavadora.cambiarState(new VendidoLavState(lavadora));
        return "Producto Vendido";
    }

    @Override
    public String rematar() {
        //lavadora.cambiarState(new RemateLavState(lavadora));
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
