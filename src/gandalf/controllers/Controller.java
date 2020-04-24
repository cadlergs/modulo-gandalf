package gandalf.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import gandalf.models.*;
import gandalf.views.*;
import gandalf.sql.*;

public class Controller {

    private View gandalfView;
    private Image gandalfImage;
    private Sound gandalfSound;
    private Thread thread;
    private ArrayList<MagicItem> magicItemList;
    private DataBase gandalfDB;

    private class WeaponComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent arg0) {
            if (arg0.getStateChange() == ItemEvent.SELECTED) {
                MagicItem magicItem = gandalfView.getMagicItem();
                gandalfView.WeaponComboBoxChange(magicItem, gandalfImage);
            }
        }
    }

    private class ElementComboBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent arg0) {
            if (arg0.getStateChange() == ItemEvent.SELECTED) {
                MagicItem magicItem = gandalfView.getMagicItem();
                gandalfView.ElementComboBoxChange(magicItem, gandalfImage);
            }
        }
    }

    private class ShowItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MagicItem magicItem = gandalfView.getMagicItem();
            gandalfView.showMagicItem(magicItem);
        }
    }

    private class SaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MagicItem magicItem = gandalfView.getMagicItem();
            if (gandalfView.confirm(magicItem) == 0) {
                gandalfDB.insertItem(magicItem);
                gandalfSound.playSaveSound();
            }
        }
    }

    private class ClearListaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gandalfView.clearList();
        }
    }

    private class ListDBListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gandalfView.clearList();
            magicItemList.clear();
            gandalfDB.listItems(magicItemList);
            for (int i = 0; i < magicItemList.size(); i++) {
                gandalfView.listFromDB(magicItemList.get(i));
            }
        }
    }

    public void init() {
        gandalfView = new View();
        gandalfSound = new Sound(this);
        gandalfDB = new DataBase();
        magicItemList = new ArrayList<>();
        gandalfImage = new Image();
        thread = new Thread(gandalfSound);
        thread.start();

        gandalfView.addWeaponComboBoxListener(new WeaponComboBoxListener());
        gandalfView.addElementComboBoxListener(new ElementComboBoxListener());
        gandalfView.addShowItemListener(new ShowItemListener());
        gandalfView.addSaveListener(new SaveListener());
        gandalfView.addClearListaListener(new ClearListaListener());
        gandalfView.addListDBListener(new ListDBListener());

        gandalfView.setVisible(true);
    }

}
