package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: n0b  reason: default package */
public final class n0b implements fjf<m0b> {
    private final wlf<t> a;

    public n0b(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m0b(this.a.get());
    }
}
