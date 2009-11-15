package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;

/**
 *
 * @author vbatygin
 */
public class CommandFactory {

    public static Command CANSEL_COMMAND = new TypedCommand("cansel", Command.OK, 0, ActionType.CANSEL);

    public static Command BUILD_COMMAND = new TypedCommand("build", Command.OK, 0, ActionType.CANSEL);

    public static Command REMOVE_COMMAND = new TypedCommand("remove", Command.OK, 0, ActionType.CANSEL);

    public static Command INFO_COMMAND = new TypedCommand("info", Command.OK, 0, ActionType.INFO);

    public static Command EXIT_COMMAND = new Command("Exit", Command.EXIT, 0);

    public static Command OK_COMMAND = new Command("OK", Command.OK, 0);


}
