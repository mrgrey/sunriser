package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;
import ru.ifmo.sunriser.model.IBuilding;

/**
 *
 * @author vbatygin
 */
public class CanselBuildingCommandListener extends AbstractBuildingCommandListener {

    public void commandAction(Command command, BuildingItem buildingItem) {
        IBuilding building = buildingItem.getBuilding();
        if (building.cansel()) {
            buildingItem.setText(building.getStatusAsString());
        } else {
            buildingItem.setText("exception: cannot cansel");
        }
        buildingItem.removeCommand(command);
        buildingItem.addCommand(CommandFactory.BUILD_COMMAND);
        buildingItem.setItemCommandListener(new CreateBuildingItemCommandListener());
    }
}
