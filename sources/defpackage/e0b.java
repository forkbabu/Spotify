package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: e0b  reason: default package */
public final class e0b implements fjf<d0b> {
    private final wlf<i> a;

    public e0b(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0b(this.a.get());
    }
}
