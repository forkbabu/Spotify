package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ada  reason: default package */
public final class ada implements fjf<zca> {
    private final wlf<Context> a;
    private final wlf<Handler> b;

    public ada(wlf<Context> wlf, wlf<Handler> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zca(this.a.get(), this.b.get());
    }
}
