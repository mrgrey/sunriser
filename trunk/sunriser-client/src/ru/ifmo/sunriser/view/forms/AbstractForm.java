package ru.ifmo.sunriser.view.forms;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import ru.ifmo.sunriser.model.ItemState;
import ru.ifmo.sunriser.net.GameState;
import ru.ifmo.sunriser.view.AbstractStringItem;
import ru.ifmo.sunriser.view.ActionType;
import ru.ifmo.sunriser.view.CommandFactory;
import ru.ifmo.sunriser.view.GetItemsable;
import ru.ifmo.sunriser.view.TypedCommand;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public class AbstractForm extends Form implements CommandListener{

    private static View midlet;
    private static GameState gameState;

    protected final Form prevForm;
    private final AbstractStringItem resourses;

    public static void setGameState(GameState gameState) {
        AbstractForm.gameState = gameState;
    }

    public static void setMidlet(View midlet) {
        AbstractForm.midlet = midlet;
    }

    public AbstractForm(String title, GetItemsable[] items, Form prevForm) {
        super(title);
        this.prevForm = prevForm;
        addCommand(CommandFactory.EXIT_COMMAND);
        setCommandListener(this);
        resourses = createResourses();
        append(resourses);
        for (int i = 0; i < items.length; ++i) {
            final AbstractStringItem item = createItem(items[i]);
            if (items[i].isInfomable()) {
                item.setDefaultCommand(CommandFactory.INFO_COMMAND);
            }
            if (items[i].isCreatable()) {
                item.addCommand(createItemCommand(items[i]));
            }
            item.setItemCommandListener(new AbstractItemCommandListener());
            append(item);
        }
    }

    public void commandAction(Command c, Displayable d) {
        if (c.getCommandType() == Command.EXIT) {
            midlet.switchDisplayable(null, prevForm);
        }
    }

    public AbstractStringItem createItem(GetItemsable item) {
        return new AbstractStringItem(item.getName(), item.getText(), item);
    }

    public AbstractStringItem createResourses() {
        return new AbstractStringItem("resourses", gameState.getResources().toString(), null);
    }

    private static Command createItemCommand(GetItemsable item) {
        switch (item.getState()) {
            case ItemState.AVALIBLE:
                return CommandFactory.BUILD_COMMAND;
            case ItemState.UNDER_CONSTRUCTION:
                return CommandFactory.CANSEL_COMMAND;
            case ItemState.ALREADY_BUILD:
                return CommandFactory.REMOVE_COMMAND;
            case ItemState.REDIRECT:
                return CommandFactory.INFO_COMMAND;
            default:
                return null;
        }
    }

    public class AbstractItemCommandListener implements ItemCommandListener {

        public void commandAction(Command c, Item item) {
            final TypedCommand command = (TypedCommand) c;
            final AbstractStringItem stringItem = (AbstractStringItem) item;
            switch (command.getActionType()) {
                case ActionType.BUILD:
                    constructBuilding(command, stringItem);
                    break;
                case ActionType.CANSEL:
                    canselBuilding(command, stringItem);
                    break;
                case ActionType.INFO:
                    viewInfo(command, stringItem);
                    break;
            }
            resourses.setText(gameState.getResources().toString());
        }

        private void constructBuilding(final TypedCommand command, final AbstractStringItem stringItem) {
            GetItemsable object = stringItem.getObject();
            if (gameState.build(object)) {
                stringItem.setText(object.getStatusAsString());
            } else {
                stringItem.setText("cannot build");
            }
            stringItem.removeCommand(command);
            stringItem.addCommand(CommandFactory.CANSEL_COMMAND);
        }

        private void canselBuilding(final TypedCommand command, final AbstractStringItem stringItem) {
            GetItemsable object = stringItem.getObject();
            if (gameState.cansel(object)) {
                stringItem.setText(object.getStatusAsString());
            } else {
                stringItem.setText("exception: cannot cansel");
            }
            stringItem.removeCommand(command);
            stringItem.addCommand(CommandFactory.BUILD_COMMAND);
        }

        private void viewInfo(final TypedCommand command, final AbstractStringItem stringItem) {
            if (stringItem.getObject().getItems() != null) {
                final GetItemsable object = stringItem.getObject();
                final Form infoForm = new AbstractForm(object.getName(), object.getItems(),
                        AbstractForm.this);
                midlet.switchDisplayable(null, infoForm);
            }
        }
    }



}
