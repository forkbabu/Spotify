package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.connectivity.e0;
import io.reactivex.subjects.c;
import io.reactivex.y;

/* renamed from: wne  reason: default package */
public final class wne implements fjf<vne> {
    private final wlf<Context> a;
    private final wlf<cqe> b;
    private final wlf<ape> c;
    private final wlf<c<ooe>> d;
    private final wlf<e0> e;
    private final wlf<y> f;

    public wne(wlf<Context> wlf, wlf<cqe> wlf2, wlf<ape> wlf3, wlf<c<ooe>> wlf4, wlf<e0> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vne(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
