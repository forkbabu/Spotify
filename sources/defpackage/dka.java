package defpackage;

import android.content.Context;
import com.spotify.music.libs.mediabrowserservice.b2;
import com.spotify.music.libs.mediabrowserservice.d3;
import com.spotify.music.libs.mediabrowserservice.k2;

/* renamed from: dka  reason: default package */
public final class dka implements fjf<cka> {
    private final wlf<Context> a;
    private final wlf<k2> b;
    private final wlf<d3> c;
    private final wlf<b2> d;
    private final wlf<pea> e;

    public dka(wlf<Context> wlf, wlf<k2> wlf2, wlf<d3> wlf3, wlf<b2> wlf4, wlf<pea> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cka(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
