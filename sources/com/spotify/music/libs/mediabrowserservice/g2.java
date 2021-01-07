package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.spotify.remoteconfig.AndroidMediaBrowserServiceProperties;

public final class g2 implements fjf<f2> {
    private final wlf<Context> a;
    private final wlf<urd> b;
    private final wlf<s1> c;
    private final wlf<AndroidMediaBrowserServiceProperties> d;

    public g2(wlf<Context> wlf, wlf<urd> wlf2, wlf<s1> wlf3, wlf<AndroidMediaBrowserServiceProperties> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f2(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
