package com.spotify.libs.connect;

import android.app.Service;
import android.content.Context;
import com.spotify.libs.connect.l;

public final class m implements fjf<l> {
    private final wlf<Context> a;
    private final wlf<Class<? extends Service>> b;
    private final wlf<l.a> c;
    private final wlf<fg0> d;

    public m(wlf<Context> wlf, wlf<Class<? extends Service>> wlf2, wlf<l.a> wlf3, wlf<fg0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
