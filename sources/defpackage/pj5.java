package defpackage;

import com.spotify.android.flags.c;

/* renamed from: pj5  reason: default package */
public final class pj5 implements fjf<Boolean> {
    private final wlf<fm9> a;
    private final wlf<c> b;

    public pj5(wlf<fm9> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a(this.b.get()));
    }
}
