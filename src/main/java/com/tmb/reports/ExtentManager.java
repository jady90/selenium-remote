package com.tmb.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

     public static void setExtentTest(ExtentTest extentTest) {
        extentTestThreadLocal.set(extentTest);
    }

     public static ExtentTest getExtentTest() {
        return extentTestThreadLocal.get();
    }

     public static void unloadExtentTest() {
        extentTestThreadLocal.remove();
    }
}
