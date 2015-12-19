package com.saiseng.ltabusapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sswong on 29/6/15.
 */
public class BusArrival extends LTAModel {
    @SerializedName("odata.metadata")
    private String metadata = "";
    @SerializedName("BusStopID")
    private String busStopID = "";
    @SerializedName("Services")
    private ArrayList<Service> services= new ArrayList<>();

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getBusStopID() {
        return busStopID;
    }

    public void setBusStopID(String busStopID) {
        this.busStopID = busStopID;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public class Service {
        @SerializedName("ServiceNo")
        private String serviceNo = "";
        @SerializedName("Status")
        private String status = "";
        @SerializedName("Operator")
        private String operator = "";
        @SerializedName("NextBus")
        private NextArrivalInfo nextBus = new NextArrivalInfo();
        @SerializedName("SubsequentBus")
        private NextArrivalInfo subsequentBus = new NextArrivalInfo();

        public String getServiceNo() {
            return serviceNo;
        }

        public void setServiceNo(String serviceNo) {
            this.serviceNo = serviceNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public NextArrivalInfo getNextBus() {
            return nextBus;
        }

        public void setNextBus(NextArrivalInfo nextBus) {
            this.nextBus = nextBus;
        }

        public NextArrivalInfo getSubsequentBus() {
            return subsequentBus;
        }

        public void setSubsequentBus(NextArrivalInfo subsequentBus) {
            this.subsequentBus = subsequentBus;
        }
    }

    public class NextArrivalInfo {
        @SerializedName("EstimatedArrival")
        private String estimatedArrival = "";
        @SerializedName("Load")
        private String load = "";
        @SerializedName("Feature")
        private String feature = "";


        public String getEstimatedArrival() {
            return estimatedArrival;
        }

        public void setEstimatedArrival(String estimatedArrival) {
            this.estimatedArrival = estimatedArrival;
        }

        public String getLoad() {
            return load;
        }

        public void setLoad(String load) {
            this.load = load;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }
    }
}
