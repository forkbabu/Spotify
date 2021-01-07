package defpackage;

import android.content.Context;
import com.spotify.share.util.m;
import com.spotify.share.util.q;
import io.reactivex.y;

/* renamed from: d7e  reason: default package */
public final class d7e implements fjf<c7e> {
    private final wlf<Context> a;
    private final wlf<q> b;
    private final wlf<y> c;
    private final wlf<x3e> d;
    private final wlf<m> e;

    public d7e(wlf<Context> wlf, wlf<q> wlf2, wlf<y> wlf3, wlf<x3e> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c7e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
