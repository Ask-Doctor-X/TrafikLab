package com.sbab.backendtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Line {

    @JsonProperty("LineNumber")
    String lineNumber;
    @JsonProperty("DirectionCode")
    String directionCode;
    @JsonProperty("JourneyPatternPointNumber")
    String journeyPatternPointNumber;
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

    public String getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(String directionCode) {
        this.directionCode = directionCode;
    }

    public String getJourneyPatternPointNumber() {
        return journeyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(String journeyPatternPointNumber) {
        this.journeyPatternPointNumber = journeyPatternPointNumber;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber='" + lineNumber + '\'' +
                ", directionCode='" + directionCode + '\'' +
                ", journeyPatternPointNumber='" + journeyPatternPointNumber + '\'' +
                ", uniqueStopPointNumber='" + uniqueStopPointNumber + '\'' +
                '}';
    }
}
