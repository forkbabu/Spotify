package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: zf3  reason: default package */
public final class zf3 implements fjf<yf3> {
    private final wlf<t> a;
    private final wlf<uk9> b;

    public zf3(wlf<t> wlf, wlf<uk9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yf3(this.a.get(), this.b.get());
    }
}
