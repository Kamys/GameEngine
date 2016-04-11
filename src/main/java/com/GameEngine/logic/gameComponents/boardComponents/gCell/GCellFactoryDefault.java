package com.GameEngine.logic.gameComponents.boardComponents.gCell;

import com.GameEngine.logic.gameComponents.gPanel.cell.GPanelCell;
import com.GameEngine.logic.gameComponents.gPanel.cell.GPanelCellFactory;
import com.GameEngine.logic.resources.manager.ResManager;

import java.util.ArrayList;

/**
 * Стандартная реализация для GCellFactory.
 */
public class GCellFactoryDefault implements GCellFactory {
    private GPanelCellFactory factory;

    public GCellFactoryDefault(GPanelCellFactory factory) {
        this.factory = factory;
    }

    @Override
    public GCell createGCell() {
        GCell gCell = new GCellDefault();
        GPanelCell panel = factory.createGPanel();
        panel.setImageIcon(ResManager.getResManager().getImageIcon(1));
        gCell.setGPanel(panel);
        return gCell;
    }

    @Override
    public ArrayList<GCell> createGCell(int number) {
        ArrayList<GCell> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(createGCell());
        }
        return list;
    }
}