package com.tmb.constants;

public class FrameworkConstants {

    private static final String CURRENT_PROJECT_PATH = System.getProperty("user.dir");
    private static final String CHROME_DRIVER_PATH = CURRENT_PROJECT_PATH + "/src/test/resources/executables/chromedriver.exe";
    private static final String EXTENT_REPORT_PATH = CURRENT_PROJECT_PATH + "/extent-test-output/index.html";


    public static String getChromeDriverPath() {
        return CHROME_DRIVER_PATH;
    }
    public static String getExtentReportPath() {
        return EXTENT_REPORT_PATH;
    }
}
