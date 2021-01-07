package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.spotlets.scannables.c;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ahd  reason: default package */
public final class ahd implements fjf<zgd> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<g<SessionState>> c;
    private final wlf<igd> d;
    private final wlf<hgd> e;
    private final wlf<hhd> f;
    private final wlf<ghd> g;
    private final wlf<b> h;
    private final wlf<b> i;
    private final wlf<c> j;
    private final wlf<w52> k;

    public ahd(wlf<y> wlf, wlf<y> wlf2, wlf<g<SessionState>> wlf3, wlf<igd> wlf4, wlf<hgd> wlf5, wlf<hhd> wlf6, wlf<ghd> wlf7, wlf<b> wlf8, wlf<b> wlf9, wlf<c> wlf10, wlf<w52> wlf11) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zgd(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
