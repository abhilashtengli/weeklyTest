package com.example.weeklytest2.model;

public class TestModel {
    private String  resturantId;
    private String  resturantName;
    private String  resturantrating;
    private String  resturantLocation;


    //-------Gestter&Setter-------
    public String getResturantId() {
        return resturantId;
    }
    public void setResturantId(String resturantId) {
        this.resturantId = resturantId;
    }
    public String getResturantName() {
        return resturantName;
    }
    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }
    public String getResturantrating() {
        return resturantrating;
    }
    public void setResturantrating(String resturantrating) {
        this.resturantrating = resturantrating;
    }
    public String getResturantLocation() {
        return resturantLocation;
    }
    public void setResturantLocation(String resturantLocation) {
        this.resturantLocation = resturantLocation;
    }

    //----------Constructor----
    public TestModel(String resturantCount, String resturantName, String resturantrating, String resturantLocation) {
        this.resturantId = resturantCount;
        this.resturantName = resturantName;
        this.resturantrating = resturantrating;
        this.resturantLocation = resturantLocation;
    }
   
}
