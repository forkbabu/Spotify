package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.t;

/* renamed from: r17  reason: default package */
public final class r17 implements fjf<q17> {
    private final wlf<m17> a;
    private final wlf<t> b;
    private final wlf<Integer> c;
    private final wlf<w> d;

    public r17(wlf<m17> wlf, wlf<t> wlf2, wlf<Integer> wlf3, wlf<w> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q17(this.a.get(), this.b.get(), this.c.get().intValue(), this.d.get());
    }
}
