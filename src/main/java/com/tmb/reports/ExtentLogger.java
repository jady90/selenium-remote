package com.tmb.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.utils.ScreenshotUtils;

public class ExtentLogger {

    public static void pass(String message) {
        ExtentManager.getExtentTest().pass(message, MediaEntityBuilder
                .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail(String message) {
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder
                .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void skip(String message) {
        ExtentManager.getExtentTest().skip(message, MediaEntityBuilder
                .createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
}
