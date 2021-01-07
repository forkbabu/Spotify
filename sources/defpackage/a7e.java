package defpackage;

import android.content.Context;
import com.spotify.share.util.q;
import defpackage.z6e;
import io.reactivex.y;

/* renamed from: a7e  reason: default package */
public final class a7e implements fjf<z6e> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<q> c;
    private final wlf<z6e.a> d;
    private final wlf<x3e> e;

    public a7e(wlf<Context> wlf, wlf<y> wlf2, wlf<q> wlf3, wlf<z6e.a> wlf4, wlf<x3e> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z6e(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
