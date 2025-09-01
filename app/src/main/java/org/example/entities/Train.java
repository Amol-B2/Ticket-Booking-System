package org.example.entities;

import java.util.List;
import java.util.Map;

public class Train
{
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String,String> stationsTimes;
    private List<String> stations;

    // Constructor
    public Train() {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationsTimes = stationsTimes;
        this.stations = stations;
    }

    //Getters & Setters

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainTd) {
        this.trainId = trainTd;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStationsTimes() {
        return stationsTimes;
    }

    public void setStationsTimes(Map<String, String> stationsTimes) {
        this.stationsTimes = stationsTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String trainInfo(){
        return String.format("Train ID: %s Train No: %s, trainId, trainNo");
    }


}
