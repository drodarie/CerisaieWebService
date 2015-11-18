package com.epul.utils;

import java.sql.Timestamp;

/**
 * Created by Dimitri on 18/11/2015.
 */
public class TimeUtils {
    public static int getDayFromTime(Timestamp timestamp) {
        return (int) (timestamp.getTime() / 86400000);
    }
}
