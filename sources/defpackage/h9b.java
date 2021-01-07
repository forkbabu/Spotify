package defpackage;

import com.spotify.mobile.android.rx.w;
import io.reactivex.y;

/* renamed from: h9b  reason: default package */
public final class h9b implements fjf<g9b> {
    private final wlf<y> a;
    private final wlf<i9b> b;
    private final wlf<k9b> c;
    private final wlf<w> d;

    public h9b(wlf<y> wlf, wlf<i9b> wlf2, wlf<k9b> wlf3, wlf<w> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g9b(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
