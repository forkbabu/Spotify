package defpackage;

import com.spotify.ubi.specification.factories.i1;
import com.spotify.ubi.specification.factories.j1;

/* renamed from: le6  reason: default package */
public final class le6 implements fjf<ke6> {
    private final wlf<ere> a;
    private final wlf<i1> b;
    private final wlf<j1> c;

    public le6(wlf<ere> wlf, wlf<i1> wlf2, wlf<j1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static ke6 a(ere ere, i1 i1Var, j1 j1Var) {
        return new ke6(ere, i1Var, j1Var);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ke6(this.a.get(), this.b.get(), this.c.get());
    }
}
