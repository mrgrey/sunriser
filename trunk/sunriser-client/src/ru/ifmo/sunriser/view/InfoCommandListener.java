package ru.ifmo.sunriser.view;

/**
 *
 * @author vbatygin
 */
public class InfoCommandListener extends AbstractBuildingCommandListener {

    public void commandAction(TypedCommand command, BuildingItem item) {
        //
    }

    public boolean isApplicaple(int commandAction) {
       return commandAction == CommandAction.INFO;
    }

}
