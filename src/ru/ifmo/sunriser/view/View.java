/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.Player;
import net.MyBDOperations;
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

    private Vector buildings;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form planetsForm;
    private StringItem buildingsString;
    private StringItem unitsString;
    private StringItem stringItem3;
    private Form buildingsForm;
    private Command exitCommand;
    private Command planetCommand;
    private Command buildingsCommand;
    private Command exitCommand1;
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
        switchDisplayable(null, getPlanetsForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
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



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: planetsForm ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initiliazed instance of planetsForm component.
     * @return the initialized component instance
     */
    public Form getPlanetsForm() {
        if (planetsForm == null) {//GEN-END:|34-getter|0|34-preInit
            // write pre-init user code here
            planetsForm = new Form("form1", new Item[] { getBuildingsString(), getUnitsString(), getStringItem3() });//GEN-BEGIN:|34-getter|1|34-postInit
            planetsForm.addCommand(getExitCommand());
            planetsForm.setCommandListener(this);//GEN-END:|34-getter|1|34-postInit
            // write post-init user code here
        }//GEN-BEGIN:|34-getter|2|
        return planetsForm;
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
                switchDisplayable(null, getPlanetsForm());//GEN-LINE:|7-commandAction|2|70-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|43-preAction
        } else if (displayable == planetsForm) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|3|43-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|4|43-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|6|
    //</editor-fold>//GEN-END:|7-commandAction|6|

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
            }//GEN-BEGIN:|8-itemCommandAction|3|8-postItemCommandAction
        }//GEN-END:|8-itemCommandAction|3|8-postItemCommandAction
        else {
            for(int i = 0; i < buildings.size(); i++) {
                final BuildingItem bItem = (BuildingItem) buildings.elementAt(i);
                if (item == bItem) {
                    IBuilding building = bItem.getBuilding();
                    if ("build".equals(command.getLabel()) && building.getState() == BuildingState.AVALIBLE) {
                        if (building.build()) {
                            bItem.setText("under construction");
                        } else {
                            bItem.setText("cannot build");
                        }
                    } else if ("cansel".equals(command.getLabel())
                            && (building.getState() == BuildingState.BUILD
                            || building.getState() == BuildingState.UNDER_CONSTRUCTION)) {
                            building.cansel();
                            bItem.setText("canselled");
                    }
                }
            }

        }
        // write post-action user code here
    }//GEN-BEGIN:|8-itemCommandAction|4|61-postAction
    //</editor-fold>//GEN-END:|8-itemCommandAction|4|61-postAction


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
            unitsString = new StringItem("Units", null);//GEN-LINE:|64-getter|1|64-postInit
            // write post-init user code here
        }//GEN-BEGIN:|64-getter|2|
        return unitsString;
    }
    //</editor-fold>//GEN-END:|64-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of stringItem3 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            stringItem3 = new StringItem("Resourses", null);//GEN-LINE:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return stringItem3;
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
                final Item buildingItem = StringItemFactory.createBuildingItem((IBuilding) gameBuildings.elementAt(i));
                buildingItem.setItemCommandListener(this);
                vector.addElement(buildingItem);
                buildingsForm.append(buildingItem);
            }
            buildings = vector;

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
