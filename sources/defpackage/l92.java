package defpackage;

import android.app.Application;
import com.spotify.mobile.android.waze.model.b;
import com.spotify.mobile.android.waze.sdkprotocol.a;
import com.spotify.remoteconfig.rb;
import io.reactivex.y;

/* renamed from: l92  reason: default package */
public final class l92 implements fjf<j92> {
    private final wlf<Application> a;
    private final wlf<y> b;
    private final wlf<a> c;
    private final wlf<o92> d;
    private final wlf<o92> e;
    private final wlf<g92> f;
    private final wlf<b> g;
    private final wlf<r92> h;
    private final wlf<rb> i;

    public l92(wlf<Application> wlf, wlf<y> wlf2, wlf<a> wlf3, wlf<o92> wlf4, wlf<o92> wlf5, wlf<g92> wlf6, wlf<b> wlf7, wlf<r92> wlf8, wlf<rb> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j92(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i);
    }
}
