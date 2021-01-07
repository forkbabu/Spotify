package com.spotify.mobile.android.service.feature;

import android.content.Context;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

public final class o implements fjf<FlagsManager> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<m> c;
    private final wlf<s> d;
    private final wlf<FireAndForgetResolver> e;
    private final wlf<g<SessionState>> f;
    private final wlf<y> g;
    private final wlf<s<Map<String, String>>> h;
    private final wlf<ColdStartTracker> i;
    private final wlf<i> j;

    public o(wlf<Context> wlf, wlf<i> wlf2, wlf<m> wlf3, wlf<s> wlf4, wlf<FireAndForgetResolver> wlf5, wlf<g<SessionState>> wlf6, wlf<y> wlf7, wlf<s<Map<String, String>>> wlf8, wlf<ColdStartTracker> wlf9, wlf<i> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new FlagsManager(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
