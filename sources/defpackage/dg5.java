package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: dg5  reason: default package */
public final class dg5 implements fjf<cg5> {
    private final wlf<hha> a;
    private final wlf<t> b;

    public dg5(wlf<hha> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cg5(this.a.get(), this.b.get());
    }
}
