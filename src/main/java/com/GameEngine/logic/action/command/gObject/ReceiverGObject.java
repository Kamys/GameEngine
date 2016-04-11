package com.GameEngine.logic.action.command.gObject;

import com.GameEngine.logic.action.command.ActionCommand;
import com.GameEngine.logic.action.command.IncorrectlySetParameter;
import com.GameEngine.logic.action.command.ReceiverAction;

import java.util.HashMap;

/**
 * Реализация для GObject.
 */
public class ReceiverGObject implements ReceiverAction {
    private HashMap<Integer,ActionCommand> map;

    public ReceiverGObject() {
        map = new HashMap<>();
    }

    @Override
    public boolean addActionCommand(ActionCommand command, int slot) {
        map.put(slot,command);
        return true;
    }

    @Override
    public boolean executeCommand(int slot) {
        ActionCommand command = map.get(slot);
        if (command != null) {
            command.execute();
            return true;
        }
        return false;
    }

    @Override
    public boolean setParameters(String nameParameters, String value, int slot) throws IncorrectlySetParameter {
        return map.get(slot).setParameters(nameParameters,value);
    }
}