package com.spotify.music.libs.carmodeengine.settings;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.v;

public class o implements d {
    private final c6a a;
    private final w b;
    private final vwc c;
    private final p f = new p();

    public o(c6a c6a, w wVar, vwc vwc) {
        this.a = c6a;
        this.b = wVar;
        this.c = vwc;
    }

    public /* synthetic */ v a(Boolean bool) {
        return this.a.b().T().P();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        p pVar = this.f;
        vwc vwc = this.c;
        w wVar = this.b;
        vwc.getClass();
        wVar.getClass();
        s<R> j0 = wVar.c("type").W(rwc.a, false, Integer.MAX_VALUE).Q(c.a).W(new a(this), false, Integer.MAX_VALUE).Q(n.a).j0(b.a);
        c6a c6a = this.a;
        c6a.getClass();
        pVar.b(j0.subscribe(new m(c6a)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "CarModeAvailabilitySettingAlwaysFreeTier";
    }
}
