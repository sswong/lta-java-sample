package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.BusArrival;

public class BusArrivalAPI extends BaseAPI {

    private String busStopId = "";
    private String serviceNo = "";

    public BusArrivalAPI(String busStopId) {
        this.busStopId = busStopId;

        String url = "http://datamall2.mytransport.sg/ltaodataservice/BusArrival";
        String apiParam = "?BusStopId=" + getBusStopId();
        if (!getServiceNo().isEmpty()) {
            apiParam = apiParam + "&ServiceNo=" + getServiceNo();
        }
        setUrl(url + apiParam);
        setFilenamePrefix("BusArrival_");
        setBaseClass(BusArrival.class);
    }

    public BusArrivalAPI(String busStopId, String serviceNo) {
        this.busStopId = busStopId;
        this.serviceNo = serviceNo;

        String url = "http://datamall2.mytransport.sg/ltaodataservice/BusArrival";
        String apiParam = "?BusStopId=" + getBusStopId();
        if (!getServiceNo().isEmpty()) {
            apiParam = apiParam + "&ServiceNo=" + getServiceNo();
        }
        setUrl(url + apiParam);
        setFilenamePrefix("BusArrival_");
        setBaseClass(BusArrival.class);
    }


    public String getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(String busStopId) {
        this.busStopId = busStopId;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

}
