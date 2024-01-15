package org.example.models;

public class Gate {
    private String gateNumber;

    public Gate(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return  gateNumber;
    }
}
