package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;

/**
 *
 * @author vbatygin
 */
public class CommandFactory {

    public static Command CANSEL_COMMAND = new Command("cansel", Command.OK, 0);

    public static Command BUILD_COMMAND = new Command("build", Command.OK, 0);

    public static Command REMOVE_COMMAND = new Command("remove", Command.OK, 0);


}
