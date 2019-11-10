package com.sda.adapter;

public class Display implements Data {

    public String parseData() {

        JSONData jsonData = new JSONData();
        return jsonData.json();

        /**or change objects inside parseData() to XMLData...**/
    }
}
