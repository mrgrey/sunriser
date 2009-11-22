package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class UnitProduser implements GetItemsable {
    
    private final Unit unit;
    private int state;

    public UnitProduser(Unit unit) {
        this.unit = unit;
        state = ItemState.AVALIBLE;
    }

    public UnitProduser(Unit unit, int state) {
        this.unit = unit;
        this.state = state;
    }

    public GetItemsable[] getItems() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getState() {
        return ItemState.AVALIBLE;
    }

    public String getStatusAsString() {
        return ": avalible,\nm: " + unit.getCost().getMetal() + " e: " +
                unit.getCost().getEnergy() + "\ntime: " + unit.getTime().toString();
    }

    public String getName() {
        return unit.getName();
    }

    public String getText() {
        return getStatusAsString();
    }

    public Resources getCost() {
        return unit.getCost();
    }

    public boolean isCreatable() {
        return true;
    }

    public boolean isInfomable() {
        return false;
    }

    public void create() {
        state = ItemState.UNDER_CONSTRUCTION;
    }

    public void cansel() {
       state = ItemState.AVALIBLE;
    }

}
