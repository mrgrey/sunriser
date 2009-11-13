package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public class SimpleBuilding implements IBuilding {
    private final String name;
    private final int state;
    private final Resources cost;

    public SimpleBuilding(final String name, final int state, final Resources cost) {
        this.name = name;
        this.state = state;
        this.cost = cost;

    }

    public int getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public boolean build() {
        return true;
    }

    public void cansel() {
        // cansel
    }

    public Resources getCost() {
        return cost;
    }


}
