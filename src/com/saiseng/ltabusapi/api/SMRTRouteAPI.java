package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.SMRTRoute;


public class SMRTRouteAPI extends BaseAPI {

    public SMRTRouteAPI() {
        setUrl("http://datamall.mytransport.sg/ltaodataservice.svc/SMRTRouteSet");
        setFilenamePrefix("SMRTRoute_");
        setBaseClass(SMRTRoute.class);
    }


}
