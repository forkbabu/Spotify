package defpackage;

import com.spotify.libs.search.history.h;
import com.spotify.libs.search.history.p;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: h4b  reason: default package */
public final class h4b implements fjf<g4b> {
    private final wlf<p> a;
    private final wlf<h> b;
    private final wlf<qqa> c;
    private final wlf<y> d;
    private final wlf<s<g>> e;
    private final wlf<w> f;

    public h4b(wlf<p> wlf, wlf<h> wlf2, wlf<qqa> wlf3, wlf<y> wlf4, wlf<s<g>> wlf5, wlf<w> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g4b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
