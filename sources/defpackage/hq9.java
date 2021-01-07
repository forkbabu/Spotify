package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.squareup.picasso.Picasso;

/* renamed from: hq9  reason: default package */
public final class hq9 implements fjf<gq9> {
    private final wlf<Picasso> a;
    private final wlf<HubsGlueImageDelegate> b;

    public hq9(wlf<Picasso> wlf, wlf<HubsGlueImageDelegate> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gq9(this.a.get(), this.b.get());
    }
}
