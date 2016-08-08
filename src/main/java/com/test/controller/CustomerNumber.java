package com.test.controller;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class CustomerNumber implements Route {
    @Override
    public Object handle(Request request, Response response) throws Exception {
        String storeAggregationLevel = request.queryParams("storeAggregationLevel");
        String date = request.queryParams("date");//long
        String comparisonMode = request.queryParams("comparisonMode");//boolean
        String fetchLocal = request.queryParams("fetchLocal");//boolean

        return 666;
    }
}
