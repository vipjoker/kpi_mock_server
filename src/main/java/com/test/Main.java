package com.test;

import com.test.controller.*;
import spark.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import static spark.Spark.*;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class Main {

    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        before("/*", (request, response) -> {
            response.header("Access-Control-Allow-Origin","*");
            response.header("Content-type", "application/json");
            logger.log(Level.INFO,"Filter works");
//            Spark.halt(401,"You are not authorized");
        });

        get("/authorize", new Authorize(),new JsonTransformer());

        get("/getStoreCompany", new StoreOperator(),new JsonTransformer());

        get("/getCustomerNumber",new CustomerNumber(), new JsonTransformer());

        get("/getCustomerNumbersForBusinessHourRanges",new CustomerNumberForBusinesHour(), new JsonTransformer());

        get("/getWriteOffAmount",new WriteOffAmount());

        get("/getTotalRevenueAmount",new TotalRevenueAmount());
    }
}
