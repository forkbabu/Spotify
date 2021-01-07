package defpackage;

import android.content.Context;

/* renamed from: yg3  reason: default package */
public final class yg3 implements fjf<xg3> {
    private final wlf<Context> a;
    private final wlf<tg3> b;

    public yg3(wlf<Context> wlf, wlf<tg3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static xg3 a(Context context, Object obj) {
        return new xg3(context, (tg3) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
