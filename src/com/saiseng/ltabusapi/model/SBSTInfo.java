package com.saiseng.ltabusapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SBSTInfo extends LTAModel {

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
        @SerializedName("SBSTInfoID")
        private String SBSTInfoID = "";
        @SerializedName("SI_SVC_NUM")
        private String SI_SVC_NUM = "";
        @SerializedName("SI_SVC_DIR")
        private String SI_SVC_DIR = "";
        @SerializedName("SI_SVC_CAT")
        private String SI_SVC_CAT = "";
        @SerializedName("SI_BS_CODE_ST")
        private String SI_BS_CODE_ST = "";
        @SerializedName("SI_BS_CODE_END")
        private String SI_BS_CODE_END = "";
        @SerializedName("SI_FREQ_AM_PK")
        private String SI_FREQ_AM_PK = "";
        @SerializedName("SI_FREQ_AM_OF")
        private String SI_FREQ_AM_OF = "";
        @SerializedName("SI_FREQ_PM_PK")
        private String SI_FREQ_PM_PK = "";
        @SerializedName("SI_FREQ_PM_OF")
        private String SI_FREQ_PM_OF = "";
        @SerializedName("SI_LOOP")
        private String SI_LOOP = "";
        @SerializedName("Summary")
        private String summary = "";
        @SerializedName("CreateDate")
        private String createDate = "";


    }
}
