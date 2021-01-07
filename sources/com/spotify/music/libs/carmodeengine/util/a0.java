package com.spotify.music.libs.carmodeengine.util;

import com.spotify.remoteconfig.b8;
import com.spotify.remoteconfig.k5;
import com.spotify.remoteconfig.m5;
import com.spotify.remoteconfig.z7;
import io.reactivex.s;

public final class a0 implements fjf<z> {
    private final wlf<Boolean> a;
    private final wlf<z7> b;
    private final wlf<m5> c;
    private final wlf<b8> d;
    private final wlf<k5> e;
    private final wlf<s<Boolean>> f;

    public a0(wlf<Boolean> wlf, wlf<z7> wlf2, wlf<m5> wlf3, wlf<b8> wlf4, wlf<k5> wlf5, wlf<s<Boolean>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get().booleanValue(), this.b, this.c, this.d, this.e, this.f.get());
    }
}
