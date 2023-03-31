package com.laundry.PBOmaven;

import java.io.Serializable;

public class code implements Serializable {
    protected static int customerCode;
    protected static double income;

    public int getCustomerCode(){
        return customerCode;
    }

    public double getIncomedata(){
        return income;
    }

}
