package ru.ifmo.sunriser.view.forms;

import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import ru.ifmo.sunriser.model.BuildingState;
import ru.ifmo.sunriser.model.IBuilding;
import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.view.BuildingItem;
import ru.ifmo.sunriser.view.CommandFactory;
import ru.ifmo.sunriser.view.View;
import ru.ifmo.sunriser.view.listeners.BuildingCommandListener;

/**
 *
 * @author vbatygin
 */
public class BuildingForm extends AbstractForm {

    public BuildingForm(String title, View midlet, PlanetForm prevForm, Player player) {
        super(title, midlet, prevForm, player);
        final Vector buildings = player.getPlanet().getBuildings();
        for(int i = 0; i < buildings.size(); ++i) {
            append(createBuildingItem((IBuilding) buildings.elementAt(i), midlet));
        }
    }

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

}
