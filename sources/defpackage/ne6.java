package defpackage;

import com.spotify.ubi.specification.factories.h1;
import com.spotify.ubi.specification.factories.j1;
import com.spotify.ubi.specification.factories.k1;

/* renamed from: ne6  reason: default package */
public final class ne6 implements fjf<me6> {
    private final wlf<String> a;
    private final wlf<ere> b;
    private final wlf<h1> c;
    private final wlf<k1> d;
    private final wlf<j1> e;

    public ne6(wlf<String> wlf, wlf<ere> wlf2, wlf<h1> wlf3, wlf<k1> wlf4, wlf<j1> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new me6(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
