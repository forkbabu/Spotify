package defpackage;

import android.content.Context;

/* renamed from: wzc  reason: default package */
public final class wzc implements fjf<vzc> {
    private final wlf<a2d> a;
    private final wlf<Context> b;

    public wzc(wlf<a2d> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static vzc a(a2d a2d, Context context) {
        return new vzc(a2d, context);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vzc(this.a.get(), this.b.get());
    }
}
