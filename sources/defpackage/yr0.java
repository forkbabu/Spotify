package defpackage;

import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;

/* renamed from: yr0  reason: default package */
public final class yr0 implements fjf<xr0> {
    private final wlf<Handler> a;
    private final wlf<FireAndForgetResolver> b;

    public yr0(wlf<Handler> wlf, wlf<FireAndForgetResolver> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xr0(this.a.get(), this.b.get());
    }
}
