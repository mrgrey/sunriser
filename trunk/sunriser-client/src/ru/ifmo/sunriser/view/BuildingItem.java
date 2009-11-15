package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.IBuilding;

/**
 *
 * @author vbatygin
 */
public class BuildingItem extends AbstractStringItem {
    private final IBuilding building;

    public BuildingItem(String label, String text, int appearanceMode, IBuilding building, View midlet) {
        super(label, text, appearanceMode, midlet);
        this.building = building;
    }

    public BuildingItem(String label, String text, IBuilding building, View midlet) {
        super(label, text, midlet);
        this.building = building;
    }

    public IBuilding getBuilding() {
        return building;
    }


}
