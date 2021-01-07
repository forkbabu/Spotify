package defpackage;

import com.spotify.mobile.android.util.ui.k;
import io.reactivex.y;

/* renamed from: gn8  reason: default package */
public final class gn8 implements fjf<fn8> {
    private final wlf<ho8> a;
    private final wlf<sm8> b;
    private final wlf<y> c;
    private final wlf<sl8> d;
    private final wlf<k> e;

    public gn8(wlf<ho8> wlf, wlf<sm8> wlf2, wlf<y> wlf3, wlf<sl8> wlf4, wlf<k> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fn8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
