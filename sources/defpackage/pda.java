package defpackage;

import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.volume.c;
import com.spotify.libs.connect.volume.controllers.p;
import com.spotify.libs.connect.volume.l;
import io.reactivex.y;

/* renamed from: pda  reason: default package */
public final class pda implements fjf<oda> {
    private final wlf<p> a;
    private final wlf<c> b;
    private final wlf<l> c;
    private final wlf<mda> d;
    private final wlf<h> e;
    private final wlf<y> f;

    public pda(wlf<p> wlf, wlf<c> wlf2, wlf<l> wlf3, wlf<mda> wlf4, wlf<h> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oda(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
