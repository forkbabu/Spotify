package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: g0b  reason: default package */
public final class g0b implements fjf<f0b> {
    private final wlf<i> a;

    public g0b(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0b(this.a.get());
    }
}
