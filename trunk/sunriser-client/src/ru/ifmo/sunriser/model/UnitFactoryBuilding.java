//package ru.ifmo.sunriser.model;
//
//import java.util.Vector;
//import javax.microedition.lcdui.Command;
//import javax.microedition.lcdui.Item;
//import javax.microedition.lcdui.ItemCommandListener;
//import javax.microedition.lcdui.StringItem;
//import ru.ifmo.sunriser.util.Time;
//import ru.ifmo.sunriser.view.CommandFactory;
//import ru.ifmo.sunriser.view.GetItemsable;
//
///**
// *
// * @author vbatygin
// */
//public class UnitFactoryBuilding extends SimpleBuilding {
//    private final Unit unit;
//
//    public UnitFactoryBuilding(String name, int state, Resources cost, Time time, GetItemsable[] items, Unit unit) {
//        super(name, state, cost, time, items);
//        this.unit = unit;
//    }
//
//    public boolean createUnit(Unit unit) {
//        return unit.create();
//    }
//
////    public Item[] getItems() {
////        StringItem item = new StringItem("create robot", null);
////        item.addCommand(CommandFactory.OK_COMMAND);
////        item.setItemCommandListener(new ItemCommandListener() {
////
////            public void commandAction(Command c, Item item) {
////                unit.create();
////            }
////        });
////        return new Item[]{item};
////    }
//
//
//
//}
