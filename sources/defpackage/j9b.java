package defpackage;

import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;

/* renamed from: j9b  reason: default package */
public final class j9b implements fjf<i9b> {
    private final wlf<w> a;
    private final wlf<fm9> b;
    private final wlf<v> c;

    public j9b(wlf<w> wlf, wlf<fm9> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i9b(this.a.get(), this.b.get(), this.c.get());
    }
}
