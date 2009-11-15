package ru.ifmo.sunriser.view.forms;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;
import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.view.CommandFactory;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public class PlanetForm extends AbstractForm {
   
    private final BuildingForm buildingForm;
    private final ShipForm shipForm;
    private final CapitansForm capitansForm;
    private final UnitsForm unitsForm;

    public PlanetForm(String title, View midlet, Form prevForm, Player player) {
        super(title, midlet, prevForm, player);
        buildingForm = new BuildingForm("my buildings", midlet, this, player);
        shipForm = new ShipForm("my ships", midlet, this, player);
        capitansForm = new CapitansForm("my capitans", midlet, this, player);
        unitsForm = new UnitsForm("my units", midlet, this, player);
        append(createItem("buildings", buildingForm));
        append(createItem("ships", shipForm));
        append(createItem("capitans", capitansForm));
        append(createItem("units", unitsForm));
    }

    public void commandAction(Command c, Displayable d) {
        super.commandAction(c, d);
    }

    private Item createItem(final String buildings, final Form form) {
        StringItem item = new StringItem(buildings, null);
        item.setItemCommandListener(new ItemCommandListener() {
            public void commandAction(Command c, Item item) {
                midlet.switchDisplayable(null, form);
            }
        });
     //   item.addCommand(CommandFactory.EXIT_COMMAND);
        return item;

    }

}
