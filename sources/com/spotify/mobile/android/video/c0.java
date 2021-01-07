package com.spotify.mobile.android.video;

import com.google.android.exoplayer2.source.t;

public class c0 {
    private final d0 a;
    private boolean b;
    private t c;

    public c0() {
        this.b = true;
        this.a = null;
    }

    public d0 a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public void c(t tVar) {
        this.c = tVar;
    }

    public void d() {
        this.b = false;
    }

    public c0(d0 d0Var) {
        this.a = d0Var;
        this.b = true;
    }
}
