package com.test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class StoreModel {

    private List<StoreModel> childLevelElements;

    private int accessLevel;

    private String name;

    private String identifier;

    private String labledName;

    private String parentLevel;

    private int currencyCode;
    private String currencySymbol;

    private String currencyName;


    public StoreModel(int accessLevel, String name, String identifier, String labledName, String parentLevel, int currencyCode, String currencySymbol, String currencyName) {
        this.accessLevel = accessLevel;
        this.name = name;
        this.identifier = identifier;
        this.labledName = labledName;
        this.parentLevel = parentLevel;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
    }

    public void addChild(StoreModel model){
        if (childLevelElements == null) {
            childLevelElements = new ArrayList<>();
        }
        childLevelElements.add(model);
    }
}
