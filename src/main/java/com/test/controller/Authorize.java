package com.test.controller;

import com.test.BasicResponse;
import com.test.Operator;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class Authorize implements Route {
    Logger logger = Logger.getLogger(Authorize.class.getName());

    @Override
    public Object handle(Request req, Response resp) throws Exception {

        String userName = req.queryParams("userName");
        String password = req.queryParams("password");
        String retailStoreId = req.queryParams("retailStoreId");
        String peripheralsTypeCode = req.queryParams("peripheralsTypeCode");
        String mobile = req.queryParams("Mobile");

        logger.log(Level.INFO, "User name is " + userName);
        logger.log(Level.INFO, "User password is " + password);
        logger.log(Level.INFO, "User retailId is " + retailStoreId);
        logger.log(Level.INFO, "User periphCode " + peripheralsTypeCode);
        logger.log(Level.INFO, "User mobile is " + mobile);

        Operator operator = new Operator(true, userName,password);
        BasicResponse basicResponse = new BasicResponse(true, 200, operator);

        return basicResponse;
    }
}
