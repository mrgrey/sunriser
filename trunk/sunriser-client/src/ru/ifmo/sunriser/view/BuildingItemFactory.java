package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.*;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;

/**
 *
 * @author vbatygin
 */
public class BuildingItemFactory {

    public static Item createBuildingItem(IBuilding building) {
        final ItemCommandListener commandListener;
        switch (building.getState()) {
            case BuildingState.AVALIBLE:
                commandListener = new CreateBuildingItemCommandListener();
                break;
            case BuildingState.UNDER_CONSTRUCTION:
            case BuildingState.BUILD:
                commandListener = new CanselBuildingCommandListener();
                break;
            default:
                throw new RuntimeException("cannot happend");
        }
        final BuildingItem buildingItem = new BuildingItem(building.getName(), building.getStatusAsString(), building);
        buildingItem.setDefaultCommand(createInfoCommand());
        buildingItem.addCommand(createBuildingCommand(building));
        buildingItem.setItemCommandListener(commandListener);
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

    public static Command createInfoCommand() {
        return CommandFactory.INFO_COMMAND;
    }


}

