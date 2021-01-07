package defpackage;

import android.content.Context;
import com.spotify.eventsender.j0;
import com.spotify.eventsender.r0;
import com.spotify.http.w;

/* renamed from: hg3  reason: default package */
public final class hg3 implements fjf<j0> {
    private final wlf<Context> a;
    private final wlf<w> b;
    private final wlf<r0> c;
    private final wlf<kg3> d;

    public hg3(wlf<Context> wlf, wlf<w> wlf2, wlf<r0> wlf3, wlf<kg3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return j0.a(this.a.get(), this.b.get().a(), this.c.get(), this.d.get());
    }
}
