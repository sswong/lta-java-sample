package com.saiseng.ltabusapi.tool;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.saiseng.ltabusapi.api.SMRTInfoAPI;
import com.saiseng.ltabusapi.model.BusArrival;
import com.saiseng.ltabusapi.model.SMRTInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingTool {

    public static void main(String[] args) {
        // read
        readData2();
    }

    public static void readData2() {
        try {
            SMRTInfoAPI obj = new SMRTInfoAPI();
            BufferedReader br = new BufferedReader(new FileReader(obj.getDataFilename()));
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(br);
            reader.setLenient(true);
            BusArrival info = gson.fromJson(reader, obj.getBaseClass());

            System.out.println("total items: " + info.getServices().size());
            System.out.println(info);
        } catch (FileNotFoundException fex) {
            fex.printStackTrace();
        }
    }
}
