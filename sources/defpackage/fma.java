package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;

/* renamed from: fma  reason: default package */
public final class fma implements fjf<ema> {
    private final wlf<HubsGlueImageDelegate> a;
    private final wlf<Context> b;

    public fma(wlf<HubsGlueImageDelegate> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ema(this.a.get(), this.b.get());
    }
}
