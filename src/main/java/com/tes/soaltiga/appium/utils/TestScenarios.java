package com.tes.soaltiga.appium.utils;

public enum TestScenarios {

    T1("TCC.001.SearchTiketPesawat.User search penerbangan")

    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

