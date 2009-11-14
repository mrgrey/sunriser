package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;

/**
 *
 * @author vbatygin
 */
public abstract  class AbstractBuildingCommandListener implements ItemCommandListener {

    public void commandAction(Command command, Item item) {
        final BuildingItem buildingItem = (BuildingItem) item;
        commandAction(command, buildingItem);
    }

    public abstract void commandAction(Command command, BuildingItem item);


}
