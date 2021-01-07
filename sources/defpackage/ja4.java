package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: ja4  reason: default package */
public final class ja4 implements fjf<c64> {
    private final wlf<Activity> a;
    private final wlf<Picasso> b;
    private final wlf<HubsGlueImageDelegate> c;

    public ja4(wlf<Activity> wlf, wlf<Picasso> wlf2, wlf<HubsGlueImageDelegate> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c64(this.c.get(), this.b.get(), nud.m(this.a.get()));
    }
}
