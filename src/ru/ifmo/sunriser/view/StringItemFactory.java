package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.*;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;

/**
 *
 * @author vbatygin
 */
public class StringItemFactory {

    public static Item createBuildingItem(IBuilding building) {
        final String state;
        switch (building.getState()) {
            case BuildingState.AVALIBLE:
                state = ": avalible";
                break;
            case BuildingState.UNDER_CONSTRUCTION:
                state = ": under construction";
                break;
            case BuildingState.BUILD:
                state = ": already built";
                break;
            default:
                throw new RuntimeException("cannot happend");
        }
        final BuildingItem stringItem = new BuildingItem(building.getName(), state, building);
        stringItem.addCommand(createBuildingCommand(building));
        return stringItem;
    }

    private static Command createBuildingCommand(IBuilding building) {
        switch (building.getState()) {
            case BuildingState.AVALIBLE:
                return new Command("build", Command.OK, 0);
            case BuildingState.UNDER_CONSTRUCTION:
                return new Command("cansel", Command.OK, 0);
            case BuildingState.BUILD:
                return new Command("remove", Command.OK, 0);
            default:
                 throw new RuntimeException("cannot happend");
        }
    }


}

