package com.spotify.music.features.podcast.entity.presentation;

import android.app.Activity;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.music.libs.viewuri.c;

public final class g implements fjf<f> {
    private final wlf<s57> a;
    private final wlf<r32> b;
    private final wlf<c> c;
    private final wlf<Activity> d;
    private final wlf<Boolean> e;
    private final wlf<s3> f;

    public g(wlf<s57> wlf, wlf<r32> wlf2, wlf<c> wlf3, wlf<Activity> wlf4, wlf<Boolean> wlf5, wlf<s3> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue(), this.f.get());
    }
}
