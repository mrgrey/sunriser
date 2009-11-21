package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public class Resources {

    private final int energy;
    private final int metal;
    private final int energyIncrease;
    private final int metalIncrease;
    private final int robots;

    public Resources(int energy, int metal, int energyIncrease, int robots, int metalIncrease) {
        this.energy = energy;
        this.metal = metal;
        this.energyIncrease = energyIncrease;
        this.metalIncrease = metalIncrease;
        this.robots = robots;
    }

    public Resources(int energy, int metal, int energyIncrease, int robots) {
        this(energy, metal, energyIncrease, robots, 0);
    }

    public Resources(int energy, int metal, int energyIncrease) {
        this(energy, metal, energyIncrease, 0, 0);
    }

    public Resources(int energy, int metal) {
        this(energy, metal, 0, 0, 0);
    }

    public int getEnergy() {
        return energy;
    }

    public int getMetal() {
        return metal;
    }
}
