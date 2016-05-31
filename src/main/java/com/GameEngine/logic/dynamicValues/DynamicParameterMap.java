package com.GameEngine.logic.dynamicValues;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * Реализация DynamicParameter через HashMap.
 */
public class DynamicParameterMap implements DynamicParameter {
    private HashMap<String, String> mapParameter;
    private static final Logger logger = LogManager.getLogger(DynamicParameterMap.class);

    public DynamicParameterMap() {
        this.mapParameter = new HashMap<>();
        logger.info("Create " + toString());
    }

    @Override
    public void putParameter(String name, String value) {
        logger.debug("putParameter Name:" + name + " value:" + value);
        mapParameter.put(name, value);
    }

    @Override
    public String getParameter(String name) {
        String value = mapParameter.get(name);
        logger.debug("getParameter Name:" + name + " value:" + value);
        return value;
    }

    @Override
    public void putParameterInt(String name, int value) throws NumberFormatException {
        logger.debug("putParameterInt Name:" + name + " value:" + value);
        mapParameter.put(name, value + "");
    }

    @Override
    public int getParameterInt(String name) throws NumberFormatException {
        int value = Integer.parseInt(mapParameter.get(name));
        logger.debug("getParameterInt Name:" + name + " value:" + value);
        return value;
    }

    @Override
    public String toString() {
        return "DynamicParameterMap{" +
                "mapParameter=" + mapParameter +
                '}';
    }
}
