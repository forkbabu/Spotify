package defpackage;

import android.content.Context;

/* renamed from: l17  reason: default package */
public final class l17 implements fjf<k17> {
    private final wlf<i61> a;
    private final wlf<o17> b;
    private final wlf<Context> c;
    private final wlf<ifd> d;

    public l17(wlf<i61> wlf, wlf<o17> wlf2, wlf<Context> wlf3, wlf<ifd> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k17(this.a, this.b, this.c, this.d);
    }
}
