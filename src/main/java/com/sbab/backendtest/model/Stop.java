package com.sbab.backendtest.model;

public class Stop {
    int stopPointNumber;
    String stopPointName;

    @Override
    public String toString() {
        return "Stop{" +
                "stopPointNumber=" + stopPointNumber +
                ", stopPointName='" + stopPointName + '\'' +
                '}';
    }

    public int getStopPointNumber() {
        return stopPointNumber;
    }

    public void setStopPointNumber(int stopPointNumber) {
        this.stopPointNumber = stopPointNumber;
    }

    public String getStopPointName() {
        return stopPointName;
    }

    public void setStopPointName(String stopPointName) {
        this.stopPointName = stopPointName;
    }
}
