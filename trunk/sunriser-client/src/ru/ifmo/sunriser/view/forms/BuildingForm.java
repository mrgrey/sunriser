//package ru.ifmo.sunriser.view.forms;
//
//import java.util.Vector;
//import javax.microedition.lcdui.Command;
//import javax.microedition.lcdui.Form;
//import javax.microedition.lcdui.Item;
//import javax.microedition.lcdui.ItemCommandListener;
//import ru.ifmo.sunriser.model.ItemState;
//import ru.ifmo.sunriser.model.Building;
//import ru.ifmo.sunriser.model.Player;
//import ru.ifmo.sunriser.view.ActionType;
//import ru.ifmo.sunriser.view.GettableItem;
//import ru.ifmo.sunriser.view.CommandFactory;
//import ru.ifmo.sunriser.view.TypedCommand;
//import ru.ifmo.sunriser.view.View;
//
///**
// *
// * @author vbatygin
// */
//public class BuildingForm extends AbstractForm {
//
//    public BuildingForm(String title, View midlet, PlanetForm prevForm, Player player) {
//        super(title, midlet, prevForm, player);
//        final Vector buildings = player.getPlanet().getBuildings();
//        for(int i = 0; i < buildings.size(); ++i) {
//            append(createBuildingItem((Building) buildings.elementAt(i), midlet));
//        }
//    }
//
//    public Item createBuildingItem(Building building, View midlet) {
//        final GettableItem buildingItem = new GettableItem(building.getName(), building.getStatusAsString(), building, midlet);
//        buildingItem.addCommand(createBuildingCommand(building));
//        buildingItem.addCommand(CommandFactory.INFO_COMMAND);
//        buildingItem.setItemCommandListener(new BuildingCommandListener());
//        return buildingItem;
//    }
//
//    private static Command createBuildingCommand(Building building) {
//        switch (building.getState()) {
//            case ItemState.AVALIBLE:
//                return CommandFactory.BUILD_COMMAND;
//            case ItemState.UNDER_CONSTRUCTION:
//                return CommandFactory.CANSEL_COMMAND;
//            case ItemState.BUILD:
//                return CommandFactory.REMOVE_COMMAND;
//            default:
//                throw new RuntimeException("cannot happend");
//        }
//    }
//
//    public class BuildingCommandListener implements ItemCommandListener {
//
//        public void commandAction(Command c, Item item) {
//            final TypedCommand command = (TypedCommand) c;
//            final GettableItem buildingItem = (GettableItem) item;
//            switch (command.getActionType()) {
//                case ActionType.BUILD:
//                    constructBuilding(command, buildingItem);
//                    break;
//                case ActionType.CANSEL:
//                    canselBuilding(command, buildingItem);
//                    break;
//                case ActionType.INFO:
//                    viewInfo(command, buildingItem);
//                    break;
//            }
//        }
//
//        private void constructBuilding(final TypedCommand command, final GettableItem buildingItem) {
//            Building building = buildingItem.getBuilding();
//            if (building.build()) {
//                buildingItem.setText(building.getStatusAsString());
//            } else {
//                buildingItem.setText("cannot build");
//            }
//            buildingItem.removeCommand(command);
//            buildingItem.setDefaultCommand(CommandFactory.CANSEL_COMMAND);
//        }
//
//        private void canselBuilding(final TypedCommand command, final GettableItem buildingItem) {
//            Building building = buildingItem.getBuilding();
//            if (building.cansel()) {
//                buildingItem.setText(building.getStatusAsString());
//            } else {
//                buildingItem.setText("exception: cannot cansel");
//            }
//            buildingItem.removeCommand(command);
//            buildingItem.addCommand(CommandFactory.BUILD_COMMAND);
//        }
//
//        private void viewInfo(final TypedCommand command, final GettableItem buildingItem) {
//            final Building building = buildingItem.getBuilding();
//            final Form infoForm = new InfoForm(building.getName(), building.getItems(), BuildingForm.this.midlet,
//                    BuildingForm.this, building);
//            BuildingForm.this.midlet.switchDisplayable(null, infoForm);
//        }
//    }
//}
