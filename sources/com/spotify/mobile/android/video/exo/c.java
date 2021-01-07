package com.spotify.mobile.android.video.exo;

import java.util.List;

public class c {
    private final long a;
    private final long b;
    private final long c;
    private final List<k> d;

    public c(long j, long j2, long j3, List<k> list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public long a() {
        return (this.c - this.b) * 1000;
    }

    public long b() {
        return this.c;
    }

    public k c(int i) {
        return this.d.get(i);
    }

    public List<k> d() {
        return this.d;
    }

    public long e() {
        return this.a;
    }

    public long f() {
        return this.b;
    }
}
