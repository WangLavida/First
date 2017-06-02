package com.wolf.first.app;

import android.os.Environment;

import java.io.File;

/**
 * Created by W.J on 2017/5/31.
 */

public class Constant {
    /**
     * mob app key
     */
    public static final String APP_KEY = "1e5a1ff5da673";
    public static final String LOG_File = Environment.getExternalStorageDirectory() + "/first/log/";
    public static final String HEADER_File = Environment.getExternalStorageDirectory() + "/first/header/";
    public static final String LOG_NAME = "log.txt";
    //头像key
    public static final String HEADER_KEY = "HEADER_KEY";
    //姓名key
    public static final String NAME_KEY = "NAME_KEY";
}
