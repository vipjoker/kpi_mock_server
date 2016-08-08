package com.test;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class JsonTransformer implements ResponseTransformer {
    private Gson gson = new Gson();
    @Override
    public String render(Object model) {
        return gson.toJson(model);
    }
}
