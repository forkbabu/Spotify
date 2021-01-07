package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import com.spotify.music.libs.mediasession.m0;

/* renamed from: gy5  reason: default package */
public final class gy5 implements fjf<fy5> {
    private final wlf<Context> a;
    private final wlf<pz5> b;
    private final wlf<o> c;
    private final wlf<m0> d;
    private final wlf<String> e;

    public gy5(wlf<Context> wlf, wlf<pz5> wlf2, wlf<o> wlf3, wlf<m0> wlf4, wlf<String> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fy5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
