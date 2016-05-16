package com.tomcat.my.ex02;

import java.io.File;

/**
 * Created by dongYer on 16/5/15.
 */
public class Constants {
    /**
     * WEB_ROOT is the directory where our HTML and other files reside.
     * For this package, WEB_ROOT is the "webroot" directory under the working
     * directory.
     * The working directory is the location in the file system
     * from where the java command was invoked.
     */
    public static final String WEB_ROOT =
            System.getProperty("user.dir") + File.separator  + "webroot";
}
