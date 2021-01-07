package defpackage;

import com.spotify.share.util.a;
import com.spotify.share.util.q;
import io.reactivex.y;

/* renamed from: l5e  reason: default package */
public final class l5e implements fjf<k5e> {
    private final wlf<a> a;
    private final wlf<q> b;
    private final wlf<y> c;
    private final wlf<x3e> d;

    public l5e(wlf<a> wlf, wlf<q> wlf2, wlf<y> wlf3, wlf<x3e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k5e(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
