package defpackage;

import android.content.Context;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.k2;
import com.spotify.remoteconfig.aj;

/* renamed from: t34  reason: default package */
public final class t34 implements fjf<s34> {
    private final wlf<Context> a;
    private final wlf<k2> b;
    private final wlf<d3> c;
    private final wlf<b2> d;
    private final wlf<pea> e;
    private final wlf<aj> f;

    public t34(wlf<Context> wlf, wlf<k2> wlf2, wlf<d3> wlf3, wlf<b2> wlf4, wlf<pea> wlf5, wlf<aj> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s34(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
