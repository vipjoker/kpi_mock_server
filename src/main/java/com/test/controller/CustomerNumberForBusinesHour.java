package com.test.controller;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.util.Collections;

/**
 * Created by oleh on 08.08.16.
 */
public class CustomerNumberForBusinesHour implements Route{
    private boolean isPresent;
    private int arrayLength = 15;
    @Override
    public Object handle(Request request, Response response) throws Exception {

        int[] array  = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++)
            array[i] = (int)(Math.random() *500);


        return array;
    }
}
