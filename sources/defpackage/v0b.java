package defpackage;

import com.spotify.libs.search.history.i;

/* renamed from: v0b  reason: default package */
public final class v0b implements fjf<u0b> {
    private final wlf<i> a;

    public v0b(wlf<i> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u0b(this.a.get());
    }
}
