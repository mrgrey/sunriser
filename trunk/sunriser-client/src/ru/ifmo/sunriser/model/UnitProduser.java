package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class UnitProduser implements GetItemsable {
    
    private final Unit unit;

    public UnitProduser(Unit unit) {
        this.unit = unit;
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

}
