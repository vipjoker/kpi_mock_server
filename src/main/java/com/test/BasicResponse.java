package com.test;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class BasicResponse {

    private boolean status;
    private int resultCode;
    private Operator operatorInfo;

    public BasicResponse (boolean status, int resultCode, Operator operatorInfo) {
        this.status = status;
        this.resultCode = resultCode;
        this.operatorInfo = operatorInfo;
    }
}
