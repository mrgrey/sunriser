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

    public void commandAction(Command command, BuildingItem buildingItem) {
        IBuilding building = buildingItem.getBuilding();
        if (building.build()) {
            buildingItem.setText(building.getStatusAsString());
        } else {
            buildingItem.setText("cannot build");
        }
        buildingItem.removeCommand(command);
        buildingItem.addCommand(CommandFactory.CANSEL_COMMAND);
        buildingItem.setItemCommandListener(new CanselBuildingCommandListener());
    }

}
