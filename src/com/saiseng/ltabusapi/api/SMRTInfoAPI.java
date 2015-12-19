package com.saiseng.ltabusapi.api;

import com.saiseng.ltabusapi.model.SMRTInfo;


public class SMRTInfoAPI extends BaseAPI {

    public SMRTInfoAPI() {
        setUrl("http://datamall.mytransport.sg/ltaodataservice.svc/SMRTInfoSet");
        setFilenamePrefix("SMRTInfo_");
        setBaseClass(SMRTInfo.class);
    }


}
