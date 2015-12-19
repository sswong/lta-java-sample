package com.saiseng.ltabusapi.tool;

import com.google.gson.Gson;
import com.saiseng.ltabusapi.api.BaseAPI;
import com.saiseng.ltabusapi.api.BusArrivalAPI;
import com.saiseng.ltabusapi.model.BusArrival;
import com.saiseng.ltabusapi.model.SMRTInfo;
import com.saiseng.ltabusapi.util.Config;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusArrivalRetrievalTool {
    private static HttpClient httpClient;

    public static void main(String[] args) {
        // bus arrival sample
        scrapData(new BusArrivalAPI("83139", "155"));
    }

    public static void scrapData(BaseAPI api) {
        int resultSize = 0;

        try {
            System.out.println("BEGIN: scrapping data");
            httpClient = HttpClientBuilder.create().build();

            resultSize = invokeAPI(api);

            System.out.println("END: total: " + resultSize);
        } catch (Exception e) {
            System.out.println("Error occur ");
            e.printStackTrace();
        }
    }

    public static int invokeAPI(BaseAPI api) {
        int total = 0;
        int page = api.getPage();

        try {
            // Create new getRequest with below mentioned URL
            HttpGet getRequest = new HttpGet(api.getUrl());

            // Add additional header to getRequest which accepts application/xml data
            getRequest.addHeader("accept", "application/json");
            getRequest.addHeader("AccountKey", Config.API_ACCOUNT_KEY);
            getRequest.addHeader("UniqueUserId", Config.API_UNIQUE_USER_ID);


            System.out.println("Page: " + page + "; URL: " + api.getUrl());
            System.out.println("begin query: " + new java.util.Date());

            // Execute your request and catch response
            HttpResponse response = httpClient.execute(getRequest);

            // Check for HTTP response code: 200 = success
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            } else {
                StringBuffer sbHeader = new StringBuffer();
                for (Header h : response.getAllHeaders()) {
                    sbHeader.append(h.getName() + "=" + h.getValue() + "\n");
                }
                FileWriter fw = new FileWriter(api.getLogFilename());
                fw.write(sbHeader.toString());
                fw.close();
            }
            System.out.println("    complete query: " + new java.util.Date());

            BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
            FileWriter fw = new FileWriter(api.getDataFilename());
            String output = "";
            StringBuffer sb = new StringBuffer();
            while ((output = br.readLine()) != null) {
                sb.append(output);
                fw.write(output);
            }
            fw.close();
            System.out.println("    complete loop: " + new java.util.Date());

            // gson to pojo: to retrieve data size
            Gson gson = new Gson();
            BusArrival info = gson.fromJson(sb.toString(), BusArrival.class);
            total = info.getServices().size();
            System.out.println("    complete cast: " + new java.util.Date());

        } catch (ClientProtocolException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return total;
    }

}
