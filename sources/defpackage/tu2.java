package defpackage;

import android.content.Context;
import com.spotify.cosmos.remoteconfig.RemoteConfigurationCosmosIntegration;
import com.spotify.http.w;

/* renamed from: tu2  reason: default package */
public final class tu2 implements fjf<e0e> {
    private final wlf<Context> a;
    private final wlf<w> b;
    private final wlf<hl0> c;
    private final wlf<RemoteConfigurationCosmosIntegration> d;

    public tu2(wlf<Context> wlf, wlf<w> wlf2, wlf<hl0> wlf3, wlf<RemoteConfigurationCosmosIntegration> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return e0e.d(this.a.get(), this.b.get().a(), this.c.get(), this.d.get());
    }
}
