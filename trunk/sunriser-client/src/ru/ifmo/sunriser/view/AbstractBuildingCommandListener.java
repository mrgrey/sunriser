package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;

/**
 *
 * @author vbatygin
 */
public abstract  class AbstractBuildingCommandListener implements ItemCommandListener {

    public static String INFO = "info";

    public void commandAction(Command c, Item item) {
        final TypedCommand command = (TypedCommand) c;
        if (command.getActionType() == CommandAction.INFO) {

        } else {
            final BuildingItem buildingItem = (BuildingItem) item;
            commandAction(command, buildingItem);
        }
    }

    public abstract void commandAction(TypedCommand command, BuildingItem item);


}
