package ru.ifmo.sunriser.view.listeners;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public class InfoFormCommandListener implements CommandListener {
    private final View midlet;

    InfoFormCommandListener(View midlet) {
        this.midlet = midlet;

    }

    public void commandAction(Command c, Displayable d) {
       if (c.getCommandType() == Command.EXIT) {
           midlet.switchDisplayable(null, midlet.getBuildingsForm());
       }
    }

}
