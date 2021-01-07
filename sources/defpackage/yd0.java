package defpackage;

import android.content.Context;
import com.spotify.glue.dialogs.g;

/* renamed from: yd0  reason: default package */
public final class yd0 implements fjf<xd0> {
    private final wlf<g> a;
    private final wlf<Context> b;
    private final wlf<ae0> c;

    public yd0(wlf<g> wlf, wlf<Context> wlf2, wlf<ae0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xd0(this.a.get(), this.b.get(), this.c.get());
    }
}
