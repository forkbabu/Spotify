package defpackage;

import android.content.Context;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.k2;

/* renamed from: l04  reason: default package */
public final class l04 implements fjf<k04> {
    private final wlf<Context> a;
    private final wlf<k2> b;
    private final wlf<d3> c;
    private final wlf<q04> d;
    private final wlf<pea> e;

    public l04(wlf<Context> wlf, wlf<k2> wlf2, wlf<d3> wlf3, wlf<q04> wlf4, wlf<pea> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k04(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
