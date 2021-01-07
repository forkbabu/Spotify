package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: j0b  reason: default package */
public final class j0b implements fjf<i0b> {
    private final wlf<i> a;

    public j0b(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i0b(this.a.get());
    }
}
