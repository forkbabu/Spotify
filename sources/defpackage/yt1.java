package defpackage;

import android.content.Context;

/* renamed from: yt1  reason: default package */
public final class yt1 implements fjf<xt1> {
    private final wlf<Context> a;

    public yt1(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xt1(this.a.get());
    }
}
