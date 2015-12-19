package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.SBSTInfo;


public class SBSTInfoAPI extends BaseAPI {

    public SBSTInfoAPI() {
        setUrl("http://datamall.mytransport.sg/ltaodataservice.svc/SBSTInfoSet");
        setFilenamePrefix("SBSTInfo_");
        setBaseClass(SBSTInfo.class);
    }
}
