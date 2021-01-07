package com.comscore.streaming;

public interface ContentMediaFormat {
    public static final int[] ALLOWED_VALUES = {FULL_CONTENT_GENERIC, FULL_CONTENT_EPISODE, FULL_CONTENT_MOVIE, PARTIAL_CONTENT_GENERIC, PARTIAL_CONTENT_EPISODE, PARTIAL_CONTENT_MOVIE, PREVIEW_GENERIC, PREVIEW_EPISODE, PREVIEW_MOVIE, EXTRA_GENERIC, EXTRA_EPISODE, EXTRA_MOVIE};
    public static final int EXTRA_EPISODE = 1012;
    public static final int EXTRA_GENERIC = 1010;
    public static final int EXTRA_MOVIE = 1013;
    public static final int FULL_CONTENT_EPISODE = 1002;
    public static final int FULL_CONTENT_GENERIC = 1001;
    public static final int FULL_CONTENT_MOVIE = 1003;
    public static final int PARTIAL_CONTENT_EPISODE = 1005;
    public static final int PARTIAL_CONTENT_GENERIC = 1004;
    public static final int PARTIAL_CONTENT_MOVIE = 1006;
    public static final int PREVIEW_EPISODE = 1008;
    public static final int PREVIEW_GENERIC = 1007;
    public static final int PREVIEW_MOVIE = 1009;
}
