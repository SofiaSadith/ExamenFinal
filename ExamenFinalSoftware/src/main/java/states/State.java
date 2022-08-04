/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package states;

import models.Electrodomestico;
import models.Lavadora;

/**
 *
 * @author Sofia Poma
 */
public abstract class State {

    Electrodomestico elec;

    State(Electrodomestico elec) {
        this.elec = elec;
    }

    public abstract String vender();

    public abstract String rematar();

    public abstract String desmantelar();

    public abstract String reparar();

}
