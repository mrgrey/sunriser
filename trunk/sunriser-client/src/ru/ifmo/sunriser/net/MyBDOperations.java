package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class MyBDOperations implements GameState {

    public MyBDOperations() {
    }

    private int metal = 1000;
    private int energy = 1000;

    public Resources getResources() {
        return new Resources(energy, metal, 100, 100);
    }

    public boolean build(GetItemsable building) {
        building.create();
        metal -= building.getCost().getMetal();
        energy -= building.getCost().getEnergy();
        return true;
    }

    public Planet getPlanet() {
       final Planet p = new Planet(null);
       p.setBuildings(Game.getBuildings(p));
       return p;
    }

    public Vector getPlanets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Player getPlayer() {
        return new Player(this);
    }

    public boolean cansel(GetItemsable object) {
        object.cansel();
        return true;
    }

}
