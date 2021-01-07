package com.comscore.streaming;

public interface ContentFeedType {
    public static final int[] ALLOWED_VALUES = {301, 302, 303, 304, 300};
    public static final int EAST_HD = 301;
    public static final int EAST_SD = 303;
    public static final int OTHER = 300;
    public static final int WEST_HD = 302;
    public static final int WEST_SD = 304;
}
