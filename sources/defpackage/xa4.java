package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: xa4  reason: default package */
public final class xa4 implements fjf<c64> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<HubsGlueImageDelegate> c;

    public xa4(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<HubsGlueImageDelegate> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c64(this.c.get(), this.b.get(), nud.m(this.a.get()));
    }
}
