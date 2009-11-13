package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import ru.ifmo.sunriser.model.IBuilding;

/**
 *
 * @author vbatygin
 */
public class BuildingItem extends StringItem {
    private final IBuilding building;

    public BuildingItem(String label, String text, int appearanceMode, IBuilding building) {
        super(label, text, appearanceMode);
        this.building = building;
    }

    public BuildingItem(String label, String text, IBuilding building) {
        super(label, text);
        this.building = building;
    }

    public IBuilding getBuilding() {
        return building;
    }


}
