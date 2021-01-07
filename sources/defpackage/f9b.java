package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: f9b  reason: default package */
public final class f9b implements fjf<e9b> {
    private final wlf<t> a;
    private final wlf<String> b;

    public f9b(wlf<t> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e9b(this.a.get(), this.b.get());
    }
}
