package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.SBSTRoute;


public class SBSTRouteAPI extends BaseAPI {

    public SBSTRouteAPI() {
        setUrl("http://datamall.mytransport.sg/ltaodataservice.svc/SBSTRouteSet");
        setFilenamePrefix("SBSTRoute_");
        setBaseClass(SBSTRoute.class);
    }


}
