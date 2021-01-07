package com.spotify.voice.api.model;

public abstract class i {
    public static final i a = new c("UNKNOWN");
    public static final i b = new c("INVALID_TOKEN");
    public static final i c = new c("INVALID_RESPONSE");
    public static final i d = new c("BOOTSTRAP");
    public static final i e = new c("HTTP_HEADERS");
    public static final i f = new c("PLAYER");
    public static final i g = new c("CHANNEL");
    public static final i h = new c("NO_MIC_PERMISSION");
    public static final i i = new c("OFFLINE");

    public static i a(String str) {
        return new c(str);
    }

    public abstract String b();
}
