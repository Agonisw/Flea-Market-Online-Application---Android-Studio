package com.jiang.geo.util;

public class CalculatorUtil {

    public static float dbstart = 0; //initiall record

    public static float dblast = dbstart; //the last value

    public static void setDbCount(float dbValue) {
        dbstart = dblast + (dbValue - dblast) * 0.2f; // with two demical number
        dblast = dbstart;
    }
}

