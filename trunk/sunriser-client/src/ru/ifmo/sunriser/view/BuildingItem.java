package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.Building;

/**
 *
 * @author vbatygin
 */
public class BuildingItem extends AbstractStringItem {
    private final Building building;

    public BuildingItem(String label, String text, int appearanceMode, Building building, View midlet) {
        super(label, text, appearanceMode, midlet);
        this.building = building;
    }

    public BuildingItem(String label, String text, Building building, View midlet) {
        super(label, text, midlet);
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }


}
