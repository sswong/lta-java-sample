Singapore LTA Bus API Client
=============

This is example of a java client tool to access Singapore LTA Bus API.

Total 7 API calls available for bus related
- 6 of them are static, update quarterly. Archive copy is available under /data/* (last extraction on: Dec 13, 2015)
- 1 is dynamic, to query bus arrival
- API object are designed as per specs found in http://www.mytransport.sg/content/dam/mytransport/DataMall_StaticData/LTA_DataMall_API_User_Guide.pdf
- API version 2.2.1 (03 June 2015)

To run this client
1. you will need to apply API access via http://www.mytransport.sg/content/mytransport/home/dataMall.html
2. generate API key
3. update API Key in com.saiseng.ltabusapi.util.Config.java
4. invoke com.saiseng.ltabusapi.tool.RetrievalTool

License
- gson, httpclient
- lta data access
- MIT

TODO
- ant/maven script
- log4j logging
- proper API key management