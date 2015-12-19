package com.saiseng.ltabusapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SBSTRoute extends LTAModel {

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
        @SerializedName("SBSTRouteID")
        private String SMRTInfoID = "";
        @SerializedName("SR_SVC_NUM")
        private String SR_SVC_NUM = "";
        @SerializedName("SR_SVC_DIR")
        private String SR_SVC_DIR = "";
        @SerializedName("SR_ROUT_SEQ")
        private String SR_ROUT_SEQ = "";
        @SerializedName("SR_BS_CODE")
        private String SR_BS_CODE = "";
        @SerializedName("SR_EXP_CODE")
        private String SR_EXP_CODE = "";
        @SerializedName("SR_DISTANCE")
        private String SR_DISTANCE = "";
        @SerializedName("SR_FST_WD")
        private String SR_FST_WD = "";
        @SerializedName("SR_LST_WD")
        private String SR_LST_WD = "";
        @SerializedName("SR_FST_SAT")
        private String SR_FST_SAT = "";
        @SerializedName("SR_LST_SAT")
        private String SR_LST_SAT = "";
        @SerializedName("SR_FST_SUN")
        private String SR_FST_SUN = "";
        @SerializedName("SR_LST_SUN")
        private String SR_LST_SUN = "";
        @SerializedName("Summary")
        private String summary = "";
        @SerializedName("CreateDate")
        private String createDate = "";


    }
}
