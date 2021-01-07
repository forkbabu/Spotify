package com.spotify.music.ads.voice.domain;

public final class q {
    public static final q b = new q("Null response");
    public static final q c = new q("Voice session failure");
    private String a;

    private q(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }
}
