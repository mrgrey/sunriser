/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.net.MyBDOperations;
import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.GameCanvas;

/**
 * @author botdes
 */
public class View extends MIDlet implements   CommandListener, ItemCommandListener {

    private boolean midletPaused = false;
    private final Player player;
    private Vector buildingItems;
    

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form buildingsForm;
    private Form capitansForm;
    private Form shipsForm;
    private Form planetForm;
    private StringItem unitsString;
    private StringItem resoursesString;
    private StringItem buildingsString;
    private StringItem capitansString;
    private StringItem shipsString;
    private Form resoursesForm;
    private Command exitCommand1;
    private Command buildingsCommand;
    private Command exitCommand;
    private Command planetCommand;
    private Command exitCommand2;
    private Command okCommand;
    private Command unitsCommand;
    private Command resoursesCommand;
    private Command capitansCommands;
    private Command shipsCommand;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The View constructor.
     */
    public View() {
        player = new Player(new MyBDOperations());

    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize

    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getPlanetForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|
    //</editor-fold>



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: planetForm ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initiliazed instance of planetForm component.
     * @return the initialized component instance
     */
    public Form getPlanetForm() {
        if (planetForm == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            planetForm = new Form("form1", new Item[] { getBuildingsString(), getUnitsString(), getResoursesString(), getCapitansString(), getShipsString() });//GEN-BEGIN:|34-getter|1|34-postInit
            planetForm.addCommand(getExitCommand());
            planetForm.setCommandListener(this);//GEN-END:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return planetForm;
    }
    //</editor-fold>//GEN-END:|34-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == buildingsForm) {//GEN-BEGIN:|7-commandAction|1|70-preAction
            if (command == exitCommand1) {//GEN-END:|7-commandAction|1|70-preAction
                // write pre-action user code here
                switchDisplayable(null, getPlanetForm());//GEN-LINE:|7-commandAction|2|70-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|81-preAction
        } else if (displayable == capitansForm) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|3|81-preAction
                // write pre-action user code here
                switchDisplayable(null, getPlanetForm());//GEN-LINE:|7-commandAction|4|81-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|43-preAction
        } else if (displayable == planetForm) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|5|43-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|6|43-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|93-preAction
        } else if (displayable == resoursesForm) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|7|93-preAction
                // write pre-action user code here
                switchDisplayable(null, getPlanetForm());//GEN-LINE:|7-commandAction|8|93-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|79-preAction
        } else if (displayable == shipsForm) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|9|79-preAction
                // write pre-action user code here
                switchDisplayable(null, getPlanetForm());//GEN-LINE:|7-commandAction|10|79-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|12|
    //</editor-fold>//GEN-END:|7-commandAction|12|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|42-getter|2|


  






    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Items ">//GEN-BEGIN:|8-itemCommandAction|0|8-preItemCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular item.
     * @param command the Command that was invoked
     * @param displayable the Item where the command was invoked
     */
    public void commandAction(Command command, Item item) {//GEN-END:|8-itemCommandAction|0|8-preItemCommandAction
        // write pre-action user code here
        if (item == buildingsString) {//GEN-BEGIN:|8-itemCommandAction|1|67-preAction
            if (command == buildingsCommand) {//GEN-END:|8-itemCommandAction|1|67-preAction
                // write pre-action user code here
                switchDisplayable(null, getBuildingsForm());//GEN-LINE:|8-itemCommandAction|2|67-postAction
                // write post-action user code here
            }//GEN-BEGIN:|8-itemCommandAction|3|91-preAction
        } else if (item == capitansString) {
            if (command == capitansCommands) {//GEN-END:|8-itemCommandAction|3|91-preAction
                // write pre-action user code here
                switchDisplayable(null, getCapitansForm());//GEN-LINE:|8-itemCommandAction|4|91-postAction
                // write post-action user code here
            }//GEN-BEGIN:|8-itemCommandAction|5|89-preAction
        } else if (item == resoursesString) {
            if (command == resoursesCommand) {//GEN-END:|8-itemCommandAction|5|89-preAction
                // write pre-action user code here
                switchDisplayable(null, getResoursesForm());//GEN-LINE:|8-itemCommandAction|6|89-postAction
                // write post-action user code here
            }//GEN-BEGIN:|8-itemCommandAction|7|97-preAction
        } else if (item == shipsString) {
            if (command == shipsCommand) {//GEN-END:|8-itemCommandAction|7|97-preAction
                // write pre-action user code here
                switchDisplayable(null, getShipsForm());//GEN-LINE:|8-itemCommandAction|8|97-postAction
                // write post-action user code here
            }//GEN-BEGIN:|8-itemCommandAction|9|87-preAction
        } else if (item == unitsString) {
            if (command == unitsCommand) {//GEN-END:|8-itemCommandAction|9|87-preAction
                // write pre-action user code here
//GEN-LINE:|8-itemCommandAction|10|87-postAction
                // write post-action user code here
            }//GEN-BEGIN:|8-itemCommandAction|11|8-postItemCommandAction
        }//GEN-END:|8-itemCommandAction|11|8-postItemCommandAction
        else {
//            for(int i = 0; i < buildingItems.size(); i++) {
//                final BuildingItem bItem = (BuildingItem) buildingItems.elementAt(i);
//                if (item == bItem) {
//                    IBuilding building = bItem.getBuilding();
//                    if ("build".equals(command.getLabel()) && building.getState() == BuildingState.AVALIBLE) {
//                        if (building.build()) {
//                            bItem.setText("under construction");
//                        } else {
//                            bItem.setText("cannot build");
//                        }
//                    } else if ("cansel".equals(command.getLabel())
//                            && (building.getState() == BuildingState.BUILD
//                            || building.getState() == BuildingState.UNDER_CONSTRUCTION)) {
//                            building.cansel();
//                            bItem.setText("canselled");
//                    }
//                }
//            }

        }
        // write post-action user code here
    }//GEN-BEGIN:|8-itemCommandAction|12|
    //</editor-fold>//GEN-END:|8-itemCommandAction|12|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: planetCommand ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of planetCommand component.
     * @return the initialized component instance
     */
    public Command getPlanetCommand() {
        if (planetCommand == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            planetCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|60-getter|1|60-postInit
            // write post-init user code here
        }//GEN-BEGIN:|60-getter|2|
        return planetCommand;
    }
    //</editor-fold>//GEN-END:|60-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: buildingsString ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initiliazed instance of buildingsString component.
     * @return the initialized component instance
     */
    public StringItem getBuildingsString() {
        if (buildingsString == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            buildingsString = new StringItem("Buildings", null);//GEN-BEGIN:|63-getter|1|63-postInit
            buildingsString.addCommand(getBuildingsCommand());
            buildingsString.setItemCommandListener(this);//GEN-END:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return buildingsString;
    }
    //</editor-fold>//GEN-END:|63-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: unitsString ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initiliazed instance of unitsString component.
     * @return the initialized component instance
     */
    public StringItem getUnitsString() {
        if (unitsString == null) {//GEN-END:|64-getter|0|64-preInit
            // write pre-init user code here
            unitsString = new StringItem("Units", null);//GEN-BEGIN:|64-getter|1|64-postInit
            unitsString.addCommand(getUnitsCommand());
            unitsString.setItemCommandListener(this);//GEN-END:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return unitsString;
    }
    //</editor-fold>//GEN-END:|64-getter|2|
    //</editor-fold>
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resoursesString ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of resoursesString component.
     * @return the initialized component instance
     */
    public StringItem getResoursesString() {
        if (resoursesString == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            resoursesString = new StringItem("Resourses", null);//GEN-BEGIN:|65-getter|1|65-postInit
            resoursesString.addCommand(getResoursesCommand());
            resoursesString.setItemCommandListener(this);//GEN-END:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return resoursesString;
    }
    //</editor-fold>//GEN-END:|65-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: buildingsCommand ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initiliazed instance of buildingsCommand component.
     * @return the initialized component instance
     */
    public Command getBuildingsCommand() {
        if (buildingsCommand == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            buildingsCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|66-getter|1|66-postInit
            // write post-init user code here
        }//GEN-BEGIN:|66-getter|2|
        return buildingsCommand;
    }
    //</editor-fold>//GEN-END:|66-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: buildingsForm ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initiliazed instance of buildingsForm component.
     * @return the initialized component instance
     */
    public Form getBuildingsForm() {
        if (buildingsForm == null) {//GEN-END:|68-getter|0|68-preInit
            // write pre-init user code here
            buildingsForm = new Form("buildings");//GEN-BEGIN:|68-getter|1|68-postInit
            buildingsForm.addCommand(getExitCommand1());
            buildingsForm.setCommandListener(this);//GEN-END:|68-getter|1|68-postInit
            // write post-init user code here
            Vector vector = new Vector();
            Vector gameBuildings = player.getPlanet().getBuildings();
            for (int i = 0; i < gameBuildings.size(); i++) {
                final Item buildingItem = BuildingItemFactory.createBuildingItem(
                        (IBuilding) gameBuildings.elementAt(i), this);
                vector.addElement(buildingItem);
                buildingsForm.append(buildingItem);
            }
            buildingItems = vector;

        }//GEN-BEGIN:|68-getter|2|
        return buildingsForm;
    }
    //</editor-fold>//GEN-END:|68-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|69-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: shipsForm ">//GEN-BEGIN:|75-getter|0|75-preInit
    /**
     * Returns an initiliazed instance of shipsForm component.
     * @return the initialized component instance
     */
    public Form getShipsForm() {
        if (shipsForm == null) {//GEN-END:|75-getter|0|75-preInit
            // write pre-init user code here
            shipsForm = new Form("form");//GEN-BEGIN:|75-getter|1|75-postInit
            shipsForm.addCommand(getExitCommand1());
            shipsForm.setCommandListener(this);//GEN-END:|75-getter|1|75-postInit
            // write post-init user code here
        }//GEN-BEGIN:|75-getter|2|
        return shipsForm;
    }
    //</editor-fold>//GEN-END:|75-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: capitansForm ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initiliazed instance of capitansForm component.
     * @return the initialized component instance
     */
    public Form getCapitansForm() {
        if (capitansForm == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            capitansForm = new Form("form");//GEN-BEGIN:|76-getter|1|76-postInit
            capitansForm.addCommand(getExitCommand1());
            capitansForm.setCommandListener(this);//GEN-END:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return capitansForm;
    }
    //</editor-fold>//GEN-END:|76-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|77-getter|0|77-preInit
    /**
     * Returns an initiliazed instance of exitCommand2 component.
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|77-getter|0|77-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|77-getter|1|77-postInit
            // write post-init user code here
        }//GEN-BEGIN:|77-getter|2|
        return exitCommand2;
    }
    //</editor-fold>//GEN-END:|77-getter|2|
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: capitansString ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of capitansString component.
     * @return the initialized component instance
     */
    public StringItem getCapitansString() {
        if (capitansString == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            capitansString = new StringItem("Capitans", null);//GEN-BEGIN:|85-getter|1|85-postInit
            capitansString.addCommand(getCapitansCommands());
            capitansString.setItemCommandListener(this);//GEN-END:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return capitansString;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|83-getter|1|83-postInit
            // write post-init user code here
        }//GEN-BEGIN:|83-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|83-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: unitsCommand ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initiliazed instance of unitsCommand component.
     * @return the initialized component instance
     */
    public Command getUnitsCommand() {
        if (unitsCommand == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            unitsCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return unitsCommand;
    }
    //</editor-fold>//GEN-END:|86-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resoursesCommand ">//GEN-BEGIN:|88-getter|0|88-preInit
    /**
     * Returns an initiliazed instance of resoursesCommand component.
     * @return the initialized component instance
     */
    public Command getResoursesCommand() {
        if (resoursesCommand == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
            resoursesCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|88-getter|1|88-postInit
            // write post-init user code here
        }//GEN-BEGIN:|88-getter|2|
        return resoursesCommand;
    }
    //</editor-fold>//GEN-END:|88-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: capitansCommands ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of capitansCommands component.
     * @return the initialized component instance
     */
    public Command getCapitansCommands() {
        if (capitansCommands == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            capitansCommands = new Command("Item", Command.ITEM, 0);//GEN-LINE:|90-getter|1|90-postInit
            // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return capitansCommands;
    }
    //</editor-fold>//GEN-END:|90-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: resoursesForm ">//GEN-BEGIN:|92-getter|0|92-preInit
    /**
     * Returns an initiliazed instance of resoursesForm component.
     * @return the initialized component instance
     */
    public Form getResoursesForm() {
        if (resoursesForm == null) {//GEN-END:|92-getter|0|92-preInit
            // write pre-init user code here
            resoursesForm = new Form("form");//GEN-BEGIN:|92-getter|1|92-postInit
            resoursesForm.addCommand(getExitCommand1());
            resoursesForm.setCommandListener(this);//GEN-END:|92-getter|1|92-postInit
            // write post-init user code here
        }//GEN-BEGIN:|92-getter|2|
        return resoursesForm;
    }
    //</editor-fold>//GEN-END:|92-getter|2|
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: shipsString ">//GEN-BEGIN:|95-getter|0|95-preInit
    /**
     * Returns an initiliazed instance of shipsString component.
     * @return the initialized component instance
     */
    public StringItem getShipsString() {
        if (shipsString == null) {//GEN-END:|95-getter|0|95-preInit
            // write pre-init user code here
            shipsString = new StringItem("Ships", null);//GEN-BEGIN:|95-getter|1|95-postInit
            shipsString.addCommand(getShipsCommand());
            shipsString.setItemCommandListener(this);//GEN-END:|95-getter|1|95-postInit
            // write post-init user code here
        }//GEN-BEGIN:|95-getter|2|
        return shipsString;
    }
    //</editor-fold>//GEN-END:|95-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: shipsCommand ">//GEN-BEGIN:|96-getter|0|96-preInit
    /**
     * Returns an initiliazed instance of shipsCommand component.
     * @return the initialized component instance
     */
    public Command getShipsCommand() {
        if (shipsCommand == null) {//GEN-END:|96-getter|0|96-preInit
            // write pre-init user code here
            shipsCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|96-getter|1|96-postInit
            // write post-init user code here
        }//GEN-BEGIN:|96-getter|2|
        return shipsCommand;
    }
    //</editor-fold>//GEN-END:|96-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
