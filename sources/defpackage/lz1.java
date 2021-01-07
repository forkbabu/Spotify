package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import com.spotify.music.libs.facebook.q;

/* renamed from: lz1  reason: default package */
public final class lz1 implements fjf<kz1> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<ae0> c;
    private final wlf<yx0> d;
    private final wlf<q> e;

    public lz1(wlf<Context> wlf, wlf<o> wlf2, wlf<ae0> wlf3, wlf<yx0> wlf4, wlf<q> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kz1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
