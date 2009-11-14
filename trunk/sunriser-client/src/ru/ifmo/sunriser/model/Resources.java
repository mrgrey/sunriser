package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public class Resources {

    private final int energy;
    private final int metal;

    public Resources(int energy, int metal) {
        this.energy = energy;
        this.metal = metal;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMetal() {
        return metal;
    }

}
