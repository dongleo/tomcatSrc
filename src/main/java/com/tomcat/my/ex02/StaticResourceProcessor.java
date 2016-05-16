package com.tomcat.my.ex02;

import java.io.IOException;

/**
 * Created by dongYer on 16/5/16.
 */
public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
