package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.BusStopCode;


public class BusStopsAPI extends BaseAPI {

    public BusStopsAPI () {
        setUrl("http://datamall.mytransport.sg/ltaodataservice.svc/BusStopCodeSet");
        setFilenamePrefix("BusStops_");
        setBaseClass(BusStopCode.class);
    }

}
