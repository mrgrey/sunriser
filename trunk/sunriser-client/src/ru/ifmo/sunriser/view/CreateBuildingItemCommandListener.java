package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import ru.ifmo.sunriser.model.IBuilding;

/**
 *
 * @author vbatygin
 */
public class CreateBuildingItemCommandListener extends AbstractBuildingCommandListener {

    public void commandAction(TypedCommand command, BuildingItem buildingItem) {
        IBuilding building = buildingItem.getBuilding();
        if (building.build()) {
            buildingItem.setText(building.getStatusAsString());
        } else {
            buildingItem.setText("cannot build");
        }
        buildingItem.removeCommand(command);
        buildingItem.setDefaultCommand(CommandFactory.CANSEL_COMMAND);
        buildingItem.setItemCommandListener(new CanselBuildingCommandListener());

    }

    public boolean isApplicaple(int commandAction) {
        return commandAction == CommandAction.BUILD;
    }

}
