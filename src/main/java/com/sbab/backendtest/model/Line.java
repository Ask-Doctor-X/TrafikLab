package com.sbab.backendtest.model;

public class Line {

    String lineNumber;
    String uniqueStopPointNumber;

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getUniqueStopPointNumber() {
        return uniqueStopPointNumber;
    }

    public void setUniqueStopPointNumber(String uniqueStopPointNumber) {
        this.uniqueStopPointNumber = uniqueStopPointNumber;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber='" + lineNumber + '\'' +
                ", uniqueStopPointNumber='" + uniqueStopPointNumber + '\'' +
                '}';
    }
}
