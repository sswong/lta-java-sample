package com.saiseng.ltabusapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BusStopCode extends LTAModel {

    @SerializedName("d")
    private ArrayList<Data> data = new ArrayList<>();

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }


    public class Data {
        @SerializedName("__metadata")
        private Meta metadata = new Meta();
        @SerializedName("BusStopCodeID")
        private String busStopCodeID = "";
        @SerializedName("Code")
        private String code = "";
        @SerializedName("Road")
        private String road = "";
        @SerializedName("Description")
        private String description = "";
        @SerializedName("Layout_Num")
        private String layoutNum = "";
        @SerializedName("Max_Pages")
        private String maxPages = "";
        @SerializedName("Summary")
        private String summary = "";
        @SerializedName("CreateDate")
        private String createDate = "";

    }
}
