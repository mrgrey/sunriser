package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.*;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import ru.ifmo.sunriser.view.listeners.BuildingCommandListener;

/**
 *
 * @author vbatygin
 */
public class BuildingItemFactory {

    public static Item createBuildingItem(IBuilding building, View midlet) {
        final BuildingItem buildingItem = new BuildingItem(building.getName(), building.getStatusAsString(), building, midlet);
        buildingItem.addCommand(createBuildingCommand(building));
        buildingItem.addCommand(CommandFactory.INFO_COMMAND);
        buildingItem.setItemCommandListener(new BuildingCommandListener());
        return buildingItem;

    }

    private static Command createBuildingCommand(IBuilding building) {
        switch (building.getState()) {
            case BuildingState.AVALIBLE:
                return CommandFactory.BUILD_COMMAND;
            case BuildingState.UNDER_CONSTRUCTION:
                return CommandFactory.CANSEL_COMMAND;
            case BuildingState.BUILD:
                return CommandFactory.REMOVE_COMMAND;
            default:
                 throw new RuntimeException("cannot happend");
        }
    }


    public static Item createSingleBuildingItem(IBuilding building, View midlet) {
        return null;
    }

}

