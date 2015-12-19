package com.saiseng.ltabusapi.api;

import java.io.File;

public class BaseAPI {


    private String url = "";
    private String filenamePrefix = "";
    private int page = 0;
    private Class baseClass = null;
    private String dataDirectory = "data";

    public String getUrl() {
        String apiParam = "";
        if (page > 0) {
            apiParam = "?$skip=" + (page * 50);
        }
        return url + apiParam;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public String getFilenamePrefix() {
        return filenamePrefix;
    }

    protected void setFilenamePrefix(String filenamePrefix) {
        this.filenamePrefix = filenamePrefix;
    }

    public String getDataFilename() {
        return dataDirectory + File.separator
                + this.getBaseClass().getSimpleName()
                + File.separator
                + filenamePrefix
                + "data_"
                + String.format("%03d", page)
                + ".json";
    }

    public String getLogFilename() {
        return dataDirectory + File.separator
                + this.getBaseClass().getSimpleName()
                + File.separator
                + filenamePrefix
                + "query_"
                + String.format("%03d", page)
                + ".log";
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setBaseClass(Class clz) {
        this.baseClass = clz;
    }

    public Class getBaseClass() {
        return this.baseClass;
    }
}
