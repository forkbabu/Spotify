package defpackage;

import android.content.Context;

/* renamed from: gla  reason: default package */
public final class gla implements fjf<fla> {
    private final wlf<Context> a;

    public gla(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fla(this.a.get());
    }
}
