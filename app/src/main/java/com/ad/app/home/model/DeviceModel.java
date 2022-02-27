package com.ad.app.home.model;

public class DeviceModel {

    private String name;
    private boolean isActive;
    private int runTime;            //in minutes
    private int energyUsage;
    private int energyCost;
    private boolean isAutomatic;
    private String startTime;       //24h format 18h/30m
    private String endTime;         //24h format 23h/30m
    private int turnOffAfter;       //in minutes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int minutes) {
        this.runTime = minutes;
    }

    public int getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(int energyUsage) {
        this.energyUsage = energyUsage;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getTurnOffAfter() {
        return turnOffAfter;
    }

    public void setTurnOffAfter(int turnOffAfter) {
        this.turnOffAfter = turnOffAfter;
    }
}
