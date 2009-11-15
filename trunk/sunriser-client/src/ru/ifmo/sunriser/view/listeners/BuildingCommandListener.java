package ru.ifmo.sunriser.view.listeners;

import javax.microedition.lcdui.AlertType;
import ru.ifmo.sunriser.view.*;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import ru.ifmo.sunriser.model.IBuilding;

/**
 *
 * @author vbatygin
 */
public class BuildingCommandListener implements ItemCommandListener {

    public void commandAction(Command c, Item item) {
        final TypedCommand command = (TypedCommand) c;
        final BuildingItem buildingItem = (BuildingItem) item;
        switch(command.getActionType()) {
            case ActionType.BUILD:
                constructBuilding(command, buildingItem);
                break;
            case ActionType.CANSEL:
                canselBuilding(command, buildingItem);
                break;
            case ActionType.INFO:
                viewInfo(command, buildingItem);
                break;
        }
    }

    private void constructBuilding(final TypedCommand command,final BuildingItem buildingItem) {
        IBuilding building = buildingItem.getBuilding();
        if (building.build()) {
            buildingItem.setText(building.getStatusAsString());
        } else {
            buildingItem.setText("cannot build");
        }
        buildingItem.removeCommand(command);
        buildingItem.setDefaultCommand(CommandFactory.CANSEL_COMMAND);
    }

    private void canselBuilding(final TypedCommand command, final BuildingItem buildingItem) {
        IBuilding building = buildingItem.getBuilding();
        if (building.cansel()) {
            buildingItem.setText(building.getStatusAsString());
        } else {
            buildingItem.setText("exception: cannot cansel");
        }
        buildingItem.removeCommand(command);
        buildingItem.addCommand(CommandFactory.BUILD_COMMAND);
    }

    private void viewInfo(final TypedCommand command, final BuildingItem buildingItem) {
        final Form shipsForm = new Form(buildingItem.getBuilding().getName() + " info");
        shipsForm.addCommand(buildingItem.getMidlet().getExitCommand());
        shipsForm.setCommandListener(new InfoFormCommandListener(buildingItem.getMidlet()));
        buildingItem.getMidlet().switchDisplayable(null, shipsForm);
    }


}
