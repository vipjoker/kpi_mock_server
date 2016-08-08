package com.test;

/**
 * Created by omakhobei on 8/8/2016.
 */
public class Operator {




    private String name ;
    private boolean hasAccess;
    private String loginName ;
    private String password ;
    private boolean isAdmin = true;
    private boolean validPassword = true;
    private int identifier = 1;
    private int storeAggregationAccessLevel =4;
    private String retailStoreId = "9090";

    public Operator(boolean hasAccess,String name,String password) {
        this.hasAccess = hasAccess;
        this.name = name;
        this.loginName = name;
        this.password = password;
    }
}
