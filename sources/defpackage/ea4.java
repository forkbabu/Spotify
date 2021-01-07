package defpackage;

import com.spotify.android.flags.c;

/* renamed from: ea4  reason: default package */
public final class ea4 implements fjf<Boolean> {
    private final wlf<c> a;
    private final wlf<fm9> b;

    public ea4(wlf<c> wlf, wlf<fm9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.b.get().a(this.a.get()));
    }
}
