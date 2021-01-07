package defpackage;

import com.spotify.ubi.specification.factories.s;

/* renamed from: z65  reason: default package */
public final class z65 implements fjf<y65> {
    private final wlf<s> a;
    private final wlf<ere> b;

    public z65(wlf<s> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y65(this.a.get(), this.b.get());
    }
}
