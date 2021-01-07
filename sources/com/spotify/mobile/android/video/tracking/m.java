package com.spotify.mobile.android.video.tracking;

public class m {
    private final long a;
    private final long b;

    public m(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public long a() {
        return Math.abs(this.b - this.a);
    }

    public boolean b() {
        return this.a <= this.b;
    }
}
