package defpackage;

import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import io.reactivex.s;

/* renamed from: j18  reason: default package */
public final class j18 implements fjf<q<h>> {
    private final wlf<s<h>> a;
    private final wlf<s<h>> b;
    private final wlf<s<h>> c;
    private final wlf<s<h>> d;
    private final wlf<s<h>> e;
    private final wlf<s<h>> f;

    public j18(wlf<s<h>> wlf, wlf<s<h>> wlf2, wlf<s<h>> wlf3, wlf<s<h>> wlf4, wlf<s<h>> wlf5, wlf<s<h>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return i.a(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
