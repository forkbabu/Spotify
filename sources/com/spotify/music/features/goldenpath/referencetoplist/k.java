package com.spotify.music.features.goldenpath.referencetoplist;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;

public final class k implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v3> c;
    private final wlf<p71> d;
    private final wlf<v> e;

    public k(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v3> wlf3, wlf<p71> wlf4, wlf<v> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.e.get();
        int i = h.a;
        return vVar.a(this.a.get(), this.b.get()).b(this.c.get(), this.d.get()).b().a();
    }
}
