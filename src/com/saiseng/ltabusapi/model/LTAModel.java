package com.saiseng.ltabusapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LTAModel {

    public class Meta {

        @SerializedName("uri")
        private String uri = "";

        @SerializedName("type")
        private String type = "";

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }


    }
}
