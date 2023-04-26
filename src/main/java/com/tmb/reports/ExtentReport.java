package com.tmb.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tmb.constants.FrameworkConstants;

import java.util.Objects;

public class ExtentReport {

    static ExtentReports extentReports;

    public static void initReport() {
        if(Objects.isNull(extentReports)) {
            extentReports = new ExtentReports();
            ExtentSparkReporter extentSparkReporter =
                    new ExtentSparkReporter(FrameworkConstants.getExtentReportPath());
            extentSparkReporter.config().setTheme(Theme.STANDARD);
            extentSparkReporter.config().setReportName("Automation Test Results");
            extentSparkReporter.config().setDocumentTitle("HTML Report");
            extentReports.attachReporter(extentSparkReporter);
        }
    }
    public static void flushReport() {
        if(Objects.nonNull(extentReports)) {
            extentReports.flush();
            ExtentManager.unloadExtentTest();
        }
    }
    public static void createExtentTest(String testName) {
        ExtentManager.setExtentTest(extentReports.createTest(testName));
    }
}
