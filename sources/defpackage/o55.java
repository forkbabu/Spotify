package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;

/* renamed from: o55  reason: default package */
public final class o55 implements fjf<g85> {
    private final wlf<Context> a;
    private final wlf<Integer> b;
    private final wlf<Integer> c;
    private final wlf<Boolean> d;

    public o55(wlf<Context> wlf, wlf<Integer> wlf2, wlf<Integer> wlf3, wlf<Boolean> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        int intValue = this.b.get().intValue();
        return (x.g(context) || x.f(context)) ? new m85(intValue, this.c.get().intValue(), this.d.get().booleanValue()) : new l85(intValue);
    }
}
