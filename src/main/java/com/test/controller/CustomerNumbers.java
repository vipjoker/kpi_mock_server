package com.test.controller;

import com.test.model.LineChartModel;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.concurrent.TimeUnit;

/**
 * Created by oleh on 08.08.16.
 */
public class CustomerNumbers implements Route {
    private int arrayLength = 15;

    @Override
    public Object handle(Request request, Response response) throws Exception {
            LineChartModel[] array  = new LineChartModel[arrayLength];
            long currentDate = System.currentTimeMillis();
            for (int i = 0; i < arrayLength; i++)
                array[i] = new LineChartModel((int)(Math.random() *500), currentDate -= TimeUnit.HOURS.toMillis(4));


            return array;
        }

}
