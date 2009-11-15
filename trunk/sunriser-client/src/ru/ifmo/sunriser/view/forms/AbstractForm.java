package ru.ifmo.sunriser.view.forms;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.xml.rpc.Type;
import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.view.CommandFactory;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public abstract class AbstractForm extends Form implements CommandListener{

    protected final View midlet;
    protected final Form prevForm;
    protected final Player player;

    public AbstractForm(String title, View midlet, Form prevForm, Player player) {
        this(title, null, midlet, prevForm, player);
    }

    public AbstractForm(String title, Item[] items, View midlet, Form prevForm, Player player) {
        super(title, items);
        this.midlet = midlet;
        this.prevForm = prevForm;
        this.player = player;
        addCommand(CommandFactory.EXIT_COMMAND);
        setCommandListener(this);
    }

    public void commandAction(Command c, Displayable d) {
        if (c.getCommandType() == Command.EXIT) {
            midlet.switchDisplayable(null, prevForm);
        }
    }



}
