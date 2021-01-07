package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.connection.n;

/* renamed from: qk1  reason: default package */
public final class qk1 implements fjf<pk1> {
    private final wlf<l> a;
    private final wlf<n> b;

    public qk1(wlf<l> wlf, wlf<n> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pk1(this.a.get(), this.b.get());
    }
}
