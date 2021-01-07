package defpackage;

import com.spotify.mobile.android.util.ui.k;
import io.reactivex.y;

/* renamed from: fo8  reason: default package */
public final class fo8 implements fjf<eo8> {
    private final wlf<sl8> a;
    private final wlf<k> b;
    private final wlf<y> c;
    private final wlf<sn8> d;
    private final wlf<vl8> e;
    private final wlf<sm8> f;

    public fo8(wlf<sl8> wlf, wlf<k> wlf2, wlf<y> wlf3, wlf<sn8> wlf4, wlf<vl8> wlf5, wlf<sm8> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eo8(ejf.a(this.a), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
