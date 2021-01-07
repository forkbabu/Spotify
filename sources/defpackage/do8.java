package defpackage;

import com.spotify.mobile.android.util.ui.k;
import io.reactivex.y;

/* renamed from: do8  reason: default package */
public final class do8 implements fjf<co8> {
    private final wlf<sl8> a;
    private final wlf<k> b;
    private final wlf<y> c;
    private final wlf<dn8> d;
    private final wlf<hn8> e;
    private final wlf<vl8> f;
    private final wlf<sm8> g;

    public do8(wlf<sl8> wlf, wlf<k> wlf2, wlf<y> wlf3, wlf<dn8> wlf4, wlf<hn8> wlf5, wlf<vl8> wlf6, wlf<sm8> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new co8(ejf.a(this.a), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
