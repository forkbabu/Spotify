package defpackage;

import android.content.Context;

/* renamed from: kb2  reason: default package */
public final class kb2 implements fjf<jb2> {
    private final wlf<Context> a;
    private final wlf<vla> b;

    public kb2(wlf<Context> wlf, wlf<vla> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jb2(this.a.get(), this.b.get());
    }
}
