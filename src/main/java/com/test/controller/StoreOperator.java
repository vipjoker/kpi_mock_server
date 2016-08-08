package com.test.controller;

import com.test.model.StoreModel;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class StoreOperator implements Route{

    Logger logger = Logger.getLogger(StoreOperator.class.getName());

    @Override
    public Object handle(Request req, Response resp) throws Exception {
        for(String key : req.queryParams()){
            logger.log(Level.INFO, "params " +key + " : " + req.queryParams(key) );
        }


        StoreModel child= new StoreModel(4, "Child", "9090", "LabelName", "ParentLevel", 0, "Hrn", "HRIVNIA");
        StoreModel parent = new StoreModel(4, "Parent", "9091", "LabelName", "ParentLevel", 0, "Hrn", "HRIVNIA");
        StoreModel grandParent= new StoreModel(4, "GrandParent", "9092", "LabelName", "ParentLevel", 0, "Hrn", "HRIVNIA");
        StoreModel grandGrandParent= new StoreModel(4, "GrandGrandParent", "9093", "LabelName", "ParentLevel", 0, "Hrn", "HRIVNIA");

        parent.addChild(child);
        grandParent.addChild(parent);
        grandGrandParent.addChild(grandParent);



        return grandGrandParent; // =)
    }

}
