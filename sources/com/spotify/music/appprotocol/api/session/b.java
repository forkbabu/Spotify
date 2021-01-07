package com.spotify.music.appprotocol.api.session;

import java.lang.ref.WeakReference;

public class b {
    private final int a;
    private final WeakReference<a> b;

    public b(a aVar) {
        this.a = aVar.c();
        this.b = new WeakReference<>(aVar);
    }

    public a a() {
        return this.b.get();
    }

    public int b() {
        return this.a;
    }
}
