package defpackage;

import android.content.Context;

/* renamed from: xv5  reason: default package */
public final class xv5 implements fjf<wv5> {
    private final wlf<Context> a;

    public xv5(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wv5(this.a.get());
    }
}
